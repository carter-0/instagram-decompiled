package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;

/* renamed from: X.9r9  reason: invalid class name and case insensitive filesystem */
public final class C390359r9 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelGroupMentionShareFragment";
    public 28D A00 = 28D.A2z;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new MJ2(this, 2));

    public final String getModuleName() {
        return "reel_group_mention_share_fragment";
    }

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        RectF A0M = AnonymousClass7TG.A0M(this, viewGroup);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup;
        28D r0 = this.A00;
        if (r0 == null) {
            r0 = 28D.A2z;
        }
        AnonymousClass80D.A07(r0, this, A002);
        AnonymousClass80D.A01(A0M, (RectF) null, A002);
        AnonymousClass80D.A0A(A002);
        AnonymousClass80D.A0B(A002);
        A002.A3Q = true;
        A002.A1c = (C387339m3) this.A01.getValue();
        return A002;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1023168714);
        super.onCreate(bundle);
        28D serializable = requireArguments().getSerializable(AnonymousClass000.A00(117));
        if (serializable != null) {
            this.A00 = serializable;
        }
        AnonymousClass0fD.A09(-168756819, A02);
    }
}
