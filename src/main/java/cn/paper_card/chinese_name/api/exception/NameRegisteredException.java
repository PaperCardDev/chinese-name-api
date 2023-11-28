package cn.paper_card.chinese_name.api.exception;

import cn.paper_card.chinese_name.api.NameInfo;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class NameRegisteredException extends Exception {
    private final @NotNull NameInfo nameInfo;

    public NameRegisteredException(@NotNull NameInfo info, @NotNull String message) {
        super(message);
        this.nameInfo = info;
    }

    public @NotNull NameInfo getNameInfo() {
        return nameInfo;
    }
}
