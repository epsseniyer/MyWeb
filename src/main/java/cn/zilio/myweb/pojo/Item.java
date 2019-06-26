package cn.zilio.myweb.pojo;

import cn.zilio.myweb.utils.ItemSubType;
import cn.zilio.myweb.utils.ItemType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "itemId", nullable = false, length = 8)
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer itemId;

    @Column(name = "itemName", nullable = false, length = 40)
    String itemName;

    @Column(name = "amount", nullable = false)
    Integer amount;

    @Column(name = "itemType", nullable = false)
    ItemType itemType;

    @Column(name = "itemSubType", nullable = false)
    ItemSubType itemSubType;

    @Column(name = "produceDate", nullable = false)
    Date produceDate;

    @Column(name = "duration", nullable = true)
    Integer duration;

    @Column(name = "batchNumber", nullable = false)
    String batchNumber;

    @Column(name = "barCode", nullable = false)
    String barCode;

    @Column(name = "imageResource", nullable = true)
    String imageResource;

    @Column(name = "vedioResource", nullable = true)
    String vedioResource;

    @Column(name = "vendorId", nullable = false)
    Integer vendorId;

    @Column(name = "commentId", nullable = false)
    Integer commentItemId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemSubType getItemSubType() {
        return itemSubType;
    }

    public void setItemSubType(ItemSubType itemSubType) {
        this.itemSubType = itemSubType;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getImageResource() {
        return imageResource;
    }

    public void setImageResource(String imageResource) {
        this.imageResource = imageResource;
    }

    public String getVedioResource() {
        return vedioResource;
    }

    public void setVedioResource(String vedioResource) {
        this.vedioResource = vedioResource;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getCommentItemId() {
        return commentItemId;
    }

    public void setCommentItemId(Integer commentItemId) {
        this.commentItemId = commentItemId;
    }
}
