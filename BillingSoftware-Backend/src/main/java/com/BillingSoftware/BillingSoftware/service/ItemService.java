package com.BillingSoftware.BillingSoftware.service;

import com.BillingSoftware.BillingSoftware.io.ItemRequest;
import com.BillingSoftware.BillingSoftware.io.ItemResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file);
    List<ItemResponse> fetchItems();
    void deleteItem(String itemId);
}
