import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var str = "Sansa Stark";
        assertThat(App.isArgumentsForSubstrCorrect(str, -1, 3)).isFalse();
        assertThat(App.isArgumentsForSubstrCorrect(str, 4, 100)).isFalse();
        assertThat(App.isArgumentsForSubstrCorrect(str, 10, 10)).isFalse();
        assertThat(App.isArgumentsForSubstrCorrect(str, 11, 1)).isFalse();
        assertThat(App.isArgumentsForSubstrCorrect(str, 3, 3)).isTrue();
        assertThat(App.isArgumentsForSubstrCorrect(str, 11, 0)).isFalse();
        assertThat(App.isArgumentsForSubstrCorrect(str, 6, 5)).isTrue();
    }
}