package me.autopapers2

import java.io.FileInputStream

class Utils {

    companion object{
        fun fileInputStream(path: String) : Result<FileInputStream>{
            try {
                val stream = FileInputStream(path)
                return Result.success(stream)
            } catch (e: Exception){
                return Result.failure(e)
            }
        }
    }

}