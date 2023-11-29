package cn.paper_card.chinese_name.api.exception;


import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class InvalidNameException extends Exception {
    public InvalidNameException(@NotNull String message) {
        super(message);
    }
}
