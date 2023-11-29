package cn.paper_card.chinese_name.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface ApplicationService {

    // 检查是否为合法中文名
    void checkNameValid(@NotNull String name) throws Exception;

    // 添加，或修改申请
    // 返回申请ID
    int addOrUpdateByUuid(@NotNull ApplicationInfo info) throws Exception;

    @Nullable ApplicationInfo queryByName(@NotNull String name) throws Exception;

    @NotNull List<ApplicationInfo> queryWithPage(int limit, int offset) throws Exception;

    @Nullable ApplicationInfo takeById(int id) throws Exception;
}
