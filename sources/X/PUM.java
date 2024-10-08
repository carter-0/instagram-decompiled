package X;

import com.facebook.common.draggableview.DraggableViewContainer;

public final class PUM implements Runnable {
    public final /* synthetic */ DraggableViewContainer A00;

    public PUM(DraggableViewContainer draggableViewContainer) {
        this.A00 = draggableViewContainer;
    }

    public final void run() {
        DraggableViewContainer draggableViewContainer = this.A00;
        if (draggableViewContainer.A0B) {
            draggableViewContainer.A0B = false;
            DraggableViewContainer.A07(draggableViewContainer, true);
        }
    }
}
