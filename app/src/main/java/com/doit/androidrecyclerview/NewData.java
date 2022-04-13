package com.doit.androidrecyclerview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewData {
    private int id;
    private String codeCls;
    private String codeType;
    private String code;
    private String codeNm;
    private String codeDesc;
    private String dispOrd;
    private String createUserId;
    private String udpateUserId;
    private List<Devices> devices;

    class Devices {
        private int id;
        private String groupCode;
        private String imageUrl;
        private String modelName;
        private String deviceName;
        private String deviceDesc;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGroupCode() {
            return groupCode;
        }

        public void setGroupCode(String groupCode) {
            this.groupCode = groupCode;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getDeviceDesc() {
            return deviceDesc;
        }

        public void setDeviceDesc(String deviceDesc) {
            this.deviceDesc = deviceDesc;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeCls() {
        return codeCls;
    }

    public void setCodeCls(String codeCls) {
        this.codeCls = codeCls;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeNm() {
        return codeNm;
    }

    public void setCodeNm(String codeNm) {
        this.codeNm = codeNm;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public String getDispOrd() {
        return dispOrd;
    }

    public void setDispOrd(String dispOrd) {
        this.dispOrd = dispOrd;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUdpateUserId() {
        return udpateUserId;
    }

    public void setUdpateUserId(String udpateUserId) {
        this.udpateUserId = udpateUserId;
    }

    public List<Devices> getDevices() {
        return devices;
    }

    public void setDevices(List<Devices> devices) {
        this.devices = devices;
    }
}