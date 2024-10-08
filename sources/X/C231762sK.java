package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.2sK  reason: invalid class name and case insensitive filesystem */
public final class C231762sK extends C231632rz {
    public final int A00;
    public final Context A01;
    public final AnonymousClass57M A02;
    public final C230682q1 A03;
    public final C230702q3 A04;

    public C231762sK(Context context, AnonymousClass57M r3, C230682q1 r4, C230702q3 r5) {
        0qQ.A0B(context, 1);
        this.A01 = context;
        this.A03 = r4;
        this.A02 = r3 == null ? null : r3;
        this.A04 = r5;
        this.A00 = R.layout.load_more_empty;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r7, Object obj, Object obj2) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(obj, 1);
        r7.A7U(0);
        C230702q3 r4 = this.A04;
        if (r4 != null) {
            String A0O = 002.A0O("load-more:", obj.hashCode());
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r2 = new C2354830a(obj, (Object) null, A0O);
            r2.A00(r4.A03);
            C230752qC r02 = r4.A00;
            if (r02 != null) {
                r2.A00(r02);
            }
            r4.A02.A01(r2.A01(), A0O);
        }
    }

    public final String getBinderGroupName() {
        return "LoadMore";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        AnonymousClass30Y A002;
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        AnonymousClass57M r0 = this.A02;
        if (r0 != null) {
            r0.A00(view, obj);
        }
        C230702q3 r2 = this.A04;
        if (r2 != null && (A002 = r2.A02.A00(002.A0O("load-more:", obj.hashCode()))) != AnonymousClass30Y.A07) {
            r2.A01.A05(view, A002);
        }
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        AnonymousClass57M r0 = this.A02;
        if (r0 != null) {
            r0.A00.A04(view);
        }
        C230702q3 r02 = this.A04;
        if (r02 != null) {
            r02.A01.A04(view);
        }
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-2126278261);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        if (tag != null) {
            ((C243823aA) tag).A00.A03((C229122ms) obj, this.A03);
            AnonymousClass0fD.A0A(929356912, A032);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A0A(475026030, A032);
        throw illegalStateException;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(605971569);
        0qQ.A0B(viewGroup, 1);
        View A002 = LoadMoreButton.A00(this.A01, this.A00, viewGroup);
        A002.setTag(new C243823aA(A002));
        AnonymousClass0fD.A0A(-298061254, A032);
        return A002;
    }

    public C231762sK(Context context, AnonymousClass57M r4) {
        this.A01 = context;
        this.A03 = null;
        this.A02 = r4 == null ? null : r4;
        this.A04 = null;
        this.A00 = R.layout.load_more_empty;
    }

    public C231762sK(Context context, int i) {
        this.A01 = context;
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A00 = R.layout.layout_empty_sticker_load_more_view;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C231762sK(Context context) {
        this(context, (AnonymousClass57M) null, (C230682q1) null, (C230702q3) null);
        0qQ.A0B(context, 1);
    }
}
