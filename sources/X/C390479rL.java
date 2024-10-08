package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9rL  reason: invalid class name and case insensitive filesystem */
public final class C390479rL extends C15291UZw {
    public static final String __redex_internal_original_name = "NoteReplyCameraFragment";
    public long A00;
    public RectF A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C41837B2s A07 = new WUP(this, 15);

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.9bv] */
    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        String str;
        0qQ.A0B(viewGroup, 0);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0D(A002, this.A07, this);
        AnonymousClass80H r0 = new AnonymousClass80H(0sl.A00, new SingletonImmutableSet(AnonymousClass80M.A00));
        r0.getClass();
        A002.A0W = r0;
        AnonymousClass80D.A05(viewGroup, A002, this, true);
        AnonymousClass80D.A07(28D.A3e, this, A002);
        A002.A3H = true;
        A002.A3Q = true;
        A002.A28 = AnonymousClass05K.A01;
        long j = this.A00;
        String str2 = this.A06;
        String str3 = this.A04;
        if (str3 == null) {
            str = "authorId";
        } else {
            String str4 = this.A05;
            if (str4 == null) {
                str = "authorUsername";
            } else {
                ImageUrl imageUrl = this.A02;
                String str5 = this.A03;
                ? obj = new Object();
                obj.A00 = j;
                obj.A05 = str2;
                obj.A03 = str3;
                obj.A04 = str4;
                obj.A01 = imageUrl;
                obj.A02 = str5;
                A002.A1B = obj;
                RectF rectF = this.A01;
                if (rectF != null) {
                    AnonymousClass80D.A04(rectF, A002, false, true);
                }
                return A002;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(852145790);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getLong("NOTE_ID");
        this.A06 = requireArguments.getString("NOTE_TEXT");
        String string = requireArguments.getString(C273654mx.A00(463));
        if (string != null) {
            this.A04 = string;
            String string2 = requireArguments.getString(C66579MXk.A00(472));
            if (string2 != null) {
                this.A05 = string2;
                this.A02 = (ImageUrl) 2Yc.A01(requireArguments, ImageUrl.class, C66579MXk.A00(471));
                this.A01 = (RectF) 2Yc.A01(requireArguments, RectF.class, "camera_entry_bounds");
                this.A03 = requireArguments.getString(C66579MXk.A00(470));
                AnonymousClass0fD.A09(694890968, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -942777218;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -881099287;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
