package me.autopapers2

import org.apache.poi.xslf.usermodel.XMLSlideShow
import java.io.FileInputStream

fun main () {
    val path = "C:/Users/glebd/Downloads/Введение в статистику_Основной уровень_Шаблон.pptx"

    var (stream, err) = wrapThrowable { FileInputStream(path) }
    if (err != null) {
        return
    }
    val slideShow = XMLSlideShow(stream)
}
