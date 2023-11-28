package cn.paper_card.chinese_name.api;

import java.util.UUID;

public record ApplicationInfo(
        int id,
        UUID uuid,
        String name,
        long time
) {
}
