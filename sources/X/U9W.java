package X;

import androidx.recyclerview.widget.RecyclerView;

public abstract class U9W extends C355538Qj {
    public int mDefaultDragDirs;
    public int mDefaultSwipeDirs;

    public int getMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        return C355538Qj.makeMovementFlags(this.mDefaultDragDirs, this.mDefaultSwipeDirs);
    }

    public void setDefaultDragDirs(int i) {
        this.mDefaultDragDirs = i;
    }

    public void setDefaultSwipeDirs(int i) {
        this.mDefaultSwipeDirs = i;
    }

    public U9W(int i, int i2) {
        this.mDefaultSwipeDirs = i2;
        this.mDefaultDragDirs = i;
    }

    public int getDragDirs(RecyclerView recyclerView, C249703kE r3) {
        return this.mDefaultDragDirs;
    }

    public int getSwipeDirs(RecyclerView recyclerView, C249703kE r3) {
        return this.mDefaultSwipeDirs;
    }
}
