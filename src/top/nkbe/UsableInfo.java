package top.nkbe;

/**
 * materialName(物品名稱), lightLevel(亮度), isApparel(是否可穿戴)
 */
public record UsableInfo(String materialName, int lightLevel, boolean isApparel) {
}