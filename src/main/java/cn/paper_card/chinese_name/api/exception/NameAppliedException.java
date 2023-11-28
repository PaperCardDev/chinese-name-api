package cn.paper_card.chinese_name.api.exception;

import cn.paper_card.chinese_name.api.ApplicationInfo;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class NameAppliedException extends Exception {
    private final @NotNull ApplicationInfo applicationInfo;

    public NameAppliedException(@NotNull ApplicationInfo applicationInfo, @NotNull String message) {
        super(message);
        this.applicationInfo = applicationInfo;
    }

    public @NotNull ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }
}
