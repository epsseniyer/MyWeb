package cn.zilio.myweb.dao;

import cn.zilio.myweb.pojo.Item;
import cn.zilio.myweb.utils.ItemSubType;
import cn.zilio.myweb.utils.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemDao extends JpaRepository<Item, Long> {
    Item findItemByItemId(Integer itemId) throws Exception;

    List<Item> findAllByName(String name) throws Exception;

    List<Item> findAllByType(ItemType itemType) throws Exception;

    List<Item> findAllBySubType(ItemSubType itemSubType) throws Exception;

    Item saveAndFlush(Item item);

    List<Item> saveAll(List<Item> items);

    void deleteInBatch(List<Item> items);
}
