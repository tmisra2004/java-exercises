package exercises;

public class Problem {
    private final String code;

    public String getCode() {
        return code;
    }

    public Problem(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem problem = (Problem) o;

        return code != null ? code.equals(problem.code) : problem.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "code='" + code + '\'' +
                " hashCode=" + hashCode() +
                '}';
    }
}
