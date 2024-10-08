package X;

public final class M6I implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ JW7 A01;

    public M6I(JW7 jw7, int i) {
        this.A01 = jw7;
        this.A00 = i;
    }

    public final void run() {
        this.A01.setCurrentFolderByIdAndSelectFirstItem(this.A00);
    }
}
