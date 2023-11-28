package cn.paper_card.chinese_name.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface ChineseNameApi {

    @NotNull NameService getNameService();

    @NotNull ApplicationService getApplicationService();

}
