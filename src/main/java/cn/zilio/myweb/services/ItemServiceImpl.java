package cn.zilio.myweb.services;

import cn.zilio.myweb.dao.ItemDao;
import cn.zilio.myweb.pojo.Item;
import cn.zilio.myweb.utils.ItemSubType;
import cn.zilio.myweb.utils.ItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service("ItemService")
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemDao itemDao;

    @Override
    public List<Item> findItemByName(String name) throws Exception {
        return itemDao.findAllByName(name);
    }

    @Override
    public List<Item> findItemByType(ItemType itemType) throws Exception {
        return itemDao.findAllByType(itemType);
    }

    @Override
    public List<Item> findItemBySubType(ItemSubType itemSubType) throws Exception {
        return itemDao.findAllBySubType(itemSubType);
    }

    @Override
    public List<Item> insertItem(Item item) {
        List<Item> items = new ArrayList<Item>();
        items.add(item);
        return insertItems(items);
    }

    @Override
    public List<Item> insertItems(List<Item> items) {
        return itemDao.saveAll(items);
    }

    @Override
    public void deleteItem(Item item) {
        List<Item> items = new ArrayList<Item>();
        items.add(item);
        deleteItems(items);
    }

    @Override
    public void deleteItems(List<Item> items) {
        itemDao.deleteInBatch(items);
    }

    @Override
    public Item updateItem(Item item) throws Exception {
        Item newItem = itemDao.findItemByItemId(item.getItemId());
        newItem.setAmount(item.getAmount());
        newItem.setBarCode(item.getBarCode());
        newItem.setBatchNumber(item.getBatchNumber());
        newItem.setCommentItemId(item.getCommentItemId());
        newItem.setDuration(item.getDuration());
        newItem.setImageResource(item.getImageResource());
        newItem.setVedioResource(item.getVedioResource());
        newItem.setItemName(item.getItemName());
        newItem.setItemType(item.getItemType());
        newItem.setItemSubType(item.getItemSubType());
        newItem.setProduceDate(item.getProduceDate());
        newItem.setVendorId(item.getVendorId());
        return itemDao.saveAndFlush(newItem);
    }

    @Override
    public List<Item> updateItems(List<Item> items) throws Exception  {
        List<Item> newItems = new ArrayList<Item>();
        for(Item i : items) {
            newItems.add(updateItem(i));
        }
        return newItems;
    }
}
