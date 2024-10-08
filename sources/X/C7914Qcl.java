package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.Qcl  reason: case insensitive filesystem */
public final class C7914Qcl extends C7925Qcw {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1492209184);
        0qQ.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.xmds_photo_review_fragment, viewGroup, false);
        this.A0B = (FrameLayout) layoutInflater.inflate(R.layout.photo_review_full, viewGroup2, false);
        AnonymousClass0fD.A09(547932977, A02);
        return viewGroup2;
    }
}
