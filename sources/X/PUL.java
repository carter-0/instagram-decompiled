package X;

import com.facebook.common.draggableview.DraggableViewContainer;

public final class PUL implements Runnable {
    public final /* synthetic */ DraggableViewContainer A00;

    public PUL(DraggableViewContainer draggableViewContainer) {
        this.A00 = draggableViewContainer;
    }

    public final void run() {
        DraggableViewContainer.A07(this.A00, false);
    }
}
