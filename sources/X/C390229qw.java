package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.ViewGroup;

/* renamed from: X.9qw  reason: invalid class name and case insensitive filesystem */
public final class C390229qw extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelInternalStickerShareFragment";

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.9m1] */
    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        C387319m1 r0;
        RectF A0M = AnonymousClass7TG.A0M(this, viewGroup);
        AnonymousClass80D A00 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A00, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A00, this);
        A00.A09 = viewGroup;
        AnonymousClass80D.A07(28D.A46, this, A00);
        AnonymousClass80D.A01(A0M, (RectF) null, A00);
        AnonymousClass80D.A0A(A00);
        AnonymousClass80D.A0B(A00);
        A00.A3Q = true;
        Context context = getContext();
        if (context != null) {
            int A01 = AnonymousClass8XF.A01(context);
            ? obj = new Object();
            obj.A00 = A01;
            obj.A01 = true;
            obj.A02 = false;
            r0 = obj;
        } else {
            r0 = null;
        }
        A00.A0Z = r0;
        return A00;
    }

    public final String getModuleName() {
        return "reel_internal_sticker_share_fragment";
    }
}
