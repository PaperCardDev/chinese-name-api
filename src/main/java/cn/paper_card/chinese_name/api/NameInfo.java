package cn.paper_card.chinese_name.api;

import java.util.UUID;

public record NameInfo(
        UUID uuid,
        String name,
        long time,
        boolean enable
) {
}
