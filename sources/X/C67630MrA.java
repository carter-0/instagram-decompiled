package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: X.MrA  reason: case insensitive filesystem */
public final class C67630MrA extends SharedElementCallback {
    public final AnonymousClass57D A00;

    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        throw AnonymousClass7TE.A11("onCaptureSharedElementSnapshot");
    }

    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        throw AnonymousClass7TE.A11("onCreateSnapshotView");
    }

    public final void onMapSharedElements(List list, Map map) {
        throw AnonymousClass7TE.A11("onMapSharedElements");
    }

    public final void onRejectSharedElements(List list) {
        throw AnonymousClass7TE.A11("onRejectSharedElements");
    }

    public final void onSharedElementEnd(List list, List list2, List list3) {
        throw AnonymousClass7TE.A11("onSharedElementEnd");
    }

    public final void onSharedElementStart(List list, List list2, List list3) {
        throw AnonymousClass7TE.A11("onSharedElementStart");
    }

    public final void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        throw AnonymousClass7TE.A11("onSharedElementsArrived");
    }

    public C67630MrA(AnonymousClass57D r1) {
        this.A00 = r1;
    }
}
