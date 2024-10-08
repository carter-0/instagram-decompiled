package X;

import android.content.Context;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LeU  reason: case insensitive filesystem */
public final class C64586LeU implements AnonymousClass0iw, AnonymousClass8XT, AnonymousClass8XQ {
    public static final String __redex_internal_original_name = "AlbumPickerFolderProvider";
    public AnonymousClass8XW A00;
    public boolean A01 = true;
    public final AnonymousClass2gB A02;
    public final UserSession A03;
    public final boolean A04;
    public final Context A05;
    public final 1UV A06 = Lc7.A00;
    public final C227382jA A07;
    public final String A08;

    public final boolean AFR(Folder folder, List list) {
        return true;
    }

    public final void DCx(Exception exc) {
    }

    public final void DpR(List list) {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.2jE] */
    public C64586LeU(Context context, AnonymousClass07i r19, AnonymousClass8XO r20, UserSession userSession, 2Cn r22, C227382jA r23, Integer num, boolean z) {
        int dimensionPixelOffset;
        AnonymousClass8XO r0;
        AnonymousClass07i r9 = r19;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1B(context2, 1, userSession2);
        this.A05 = context2;
        this.A03 = userSession2;
        C227382jA r7 = r23;
        this.A07 = r7;
        this.A04 = z;
        AnonymousClass2gB r4 = new AnonymousClass2gB();
        this.A02 = r4;
        if (num != null) {
            dimensionPixelOffset = num.intValue();
        } else {
            dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.album_thumbnail_image_size);
        }
        AnonymousClass8XN r6 = new AnonymousClass8XN(r19 == null ? AnonymousClass07i.A00((ComponentActivity) context2) : r9, new C355608Qq(context2, userSession2, AnonymousClass05K.A00, dimensionPixelOffset, dimensionPixelOffset, false));
        r6.A07 = this;
        r6.A04 = userSession2;
        r6.A0B = true;
        r6.A0F = true;
        r6.A09 = true;
        r6.A02 = new C64715Lgo(0);
        if (z) {
            r0 = AnonymousClass8XO.PHOTO_ONLY;
        } else {
            r0 = AnonymousClass8XO.PHOTO_AND_VIDEO;
        }
        r6.A03 = r0;
        if (new Object().A00(userSession2)) {
            r6.A08 = this;
            r6.A06 = r7;
            r6.A0D = true;
        }
        AnonymousClass8XO r72 = r20;
        if (r20 != null && 182.A06(0Tu.A05, userSession2, 2342163288484487334L)) {
            r6.A03 = r72;
        }
        r6.A01 = new AnonymousClass8XV(userSession2, dimensionPixelOffset);
        AnonymousClass8XW r1 = new AnonymousClass8XW(context2, r22, (AnonymousClass8XX) null, new AnonymousClass8XU(r6));
        this.A00 = r1;
        r1.A0A(Integer.MAX_VALUE);
        r4.A0E(DbT.A0G(C361578gS.A00(userSession2).A06), new C64319LZu(58, new C58727Iwa(this, 40)));
        this.A08 = "album_picker_folder_provider";
    }

    public static final List A00(C64586LeU leU) {
        ArrayList A042 = leU.A00.A04();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (leU.A06.apply(next)) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final List A01(C64586LeU leU) {
        ArrayList A052 = leU.A00.A05();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A052.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (leU.A06.apply(next)) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public final void A03() {
        this.A00.A0A(Integer.MAX_VALUE);
        if (this.A01) {
            UserSession userSession = this.A03;
            if (JTS.A1Y(userSession)) {
                C361578gS.A00(userSession).A03("album_picker");
            }
        }
    }

    public final List C2u(Integer num) {
        ComponentActivity componentActivity;
        ComponentActivity componentActivity2 = this.A05;
        if (componentActivity2 instanceof FragmentActivity) {
            componentActivity = componentActivity2;
        } else {
            componentActivity = null;
        }
        if (componentActivity == null) {
            return 0sn.A00;
        }
        AnonymousClass07a.A00(componentActivity);
        try {
            UserSession userSession = this.A03;
            C227382jA r0 = this.A07;
            AnonymousClass7TG.A1T(componentActivity2, userSession, r0);
            return JTS.A0Q(componentActivity2, userSession, r0).A00(new AnonymousClass9IE(AnonymousClass7TE.A1I(C390879rz.SMART_ALBUMS), 25));
        } catch (IllegalStateException unused) {
            return 0sn.A00;
        }
    }

    public final void DQY(AnonymousClass8XW r3, List list, List list2, int i) {
        this.A02.A0B(A02());
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final ArrayList A02() {
        List list;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(A00(this));
        if (this.A01) {
            UserSession userSession = this.A03;
            if (JTS.A1Y(userSession)) {
                list = AnonymousClass9Q0.A01(JTO.A17(C361578gS.A00(userSession).A06));
                A1C.addAll(list);
                A1C.addAll(A01(this));
                return A1C;
            }
        }
        list = 0sn.A00;
        A1C.addAll(list);
        A1C.addAll(A01(this));
        return A1C;
    }
}
