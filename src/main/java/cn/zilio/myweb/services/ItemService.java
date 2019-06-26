package cn.zilio.myweb.services;

import cn.zilio.myweb.pojo.Item;
import cn.zilio.myweb.utils.ItemSubType;
import cn.zilio.myweb.utils.ItemType;

import java.util.List;

public interface ItemService {
    List<Item> findItemByName(String name) throws Exception;

    List<Item> findItemByType(ItemType itemType) throws Exception;

    List<Item> findItemBySubType(ItemSubType itemSubType) throws Exception;

    List<Item> insertItem(Item item);

    List<Item> insertItems(List<Item> items);

    void deleteItem(Item item);

    void deleteItems(List<Item> items);

    Item updateItem(Item item) throws Exception ;

    List<Item> updateItems(List<Item> items) throws Exception ;
}
