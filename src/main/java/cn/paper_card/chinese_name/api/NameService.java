package cn.paper_card.chinese_name.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface NameService {

    // 添加或更新中文名
    boolean addOrUpdateByUuid(@NotNull NameInfo info) throws Exception;

    // 删除
    boolean removeName(@NotNull UUID uuid) throws Exception;

    // 却换是否启用
    boolean toggleEnable(@NotNull UUID uuid, boolean enable) throws Exception;

    // 根据UUID进行查询
    @Nullable NameInfo queryByUuid(@NotNull UUID uuid) throws Exception;

    // 根据名字查询
    @Nullable NameInfo queryByName(@NotNull String name) throws Exception;

}
