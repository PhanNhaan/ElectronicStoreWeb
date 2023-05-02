/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.dto;
import java.lang.Long;

/**
 *
 * @author DELL
 */
public class ModifyAssetDTO {
    private Long assetId;
    private String assetName;
    private String assetPath;
    private String assetType;
    private String assetRole;
    private boolean deleted;
    public ModifyAssetDTO() {
    }

    public ModifyAssetDTO(Long assetId, String assetName, String assetPath, String assetType, String assetRole, boolean deleted) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.assetPath = assetPath;
        this.assetType = assetType;
        this.assetRole = assetRole;
        this.deleted = deleted;
    }

  
    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public void setAssetPath(String assetPath) {
        this.assetPath = assetPath;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetRole() {
        return assetRole;
    }

    public void setAssetRole(String assetRole) {
        this.assetRole = assetRole;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    
}
