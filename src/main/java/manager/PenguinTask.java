package manager;

public class PenguinTask {
    String description;
    boolean status;

    public PenguinTask(String description) {
        this.description = description;
        this.status = false;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String status = this.status ? "x" : " ";
        return String.format("[%s] %s", status, this.description);
    }
}
