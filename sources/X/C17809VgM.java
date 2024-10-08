package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.VgM  reason: case insensitive filesystem */
public final class C17809VgM {
    public final Context A00;
    public final C20989X8f A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.V46] */
    public final View A00(ViewGroup viewGroup, boolean z) {
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.limited_comment_row);
        0qQ.A0A(A0C);
        0qQ.A0B(A0C, 1);
        ? obj = new Object();
        obj.A01 = A0C;
        obj.A02 = AnonymousClass7TF.A0G(A0C, R.id.limited_comment_row);
        obj.A07 = DbX.A0a(obj.A01, R.id.row_comment_imageview);
        obj.A06 = DbX.A0Z(obj.A01, R.id.row_comment_textview_comment);
        obj.A05 = AnonymousClass7TG.A0R(obj.A01, R.id.row_comment_textview_time_ago);
        obj.A03 = AnonymousClass7TG.A0R(obj.A01, R.id.row_comment_textview_approve_button);
        obj.A04 = AnonymousClass7TG.A0R(obj.A01, R.id.row_comment_textview_delete_button);
        View A0G = AnonymousClass7TF.A0G(obj.A01, R.id.row_comment_indent);
        obj.A00 = A0G;
        A0G.setVisibility(DbW.A01(z ? 1 : 0));
        obj.A06.A00 = true;
        A0C.setTag(obj);
        return A0C;
    }

    public C17809VgM(Context context, C20989X8f x8f) {
        this.A00 = context;
        this.A01 = x8f;
    }
}
