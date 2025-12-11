package me.autopapers2

import org.apache.poi.sl.usermodel.SlideShow
import org.apache.poi.xslf.usermodel.XMLSlideShow
import java.io.FileInputStream

fun main (){
    val path = "C:/Users/glebd/Downloads/Введение в статистику_Основной уровень_Шаблон.pptx"
//    val input = Utils.fileInputStream(path).fold(
//        onSuccess = {value -> return@fold value},
//        onFailure = {err ->
//            print(err)
//        }
//    )

    Result

    val (stream, err) = Utils.fileInputStream(path)
    if (err != null){
        print(err)
        Throwable.of
    }
    val slideShow = XMLSlideShow(stream)


//    if (input.isFailure){
//
//        return
//    }
//    val slideShow = XMLSlideShow(input.)
//    for (slide in slideShow.slides) {
//        print(slide)
//    }
//    Result
}

operator fun <T> Result<T>.component1(): T?{
    return this.getOrNull()
}
operator fun <T> Result<T>.component2(): Throwable?{
    return this.exceptionOrNull()
}
