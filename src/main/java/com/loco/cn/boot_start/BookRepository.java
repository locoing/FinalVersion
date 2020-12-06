package com.loco.cn.boot_start;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
