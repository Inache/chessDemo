package lv.helloit.board;

public class Move {
    public Coordinates from;
    public Coordinates to;

    private Move(Builder builder) {
        from = builder.from;
        to = builder.to;
    }

    public static final class Builder {
        private Coordinates from;
        private Coordinates to;

        public Builder() {
        }

        public Builder from(Coordinates val) {
            from = val;
            return this;
        }

        public Builder to(Coordinates val) {
            to = val;
            return this;
        }

        public Move build() {
            return new Move(this);
        }
    }
}
