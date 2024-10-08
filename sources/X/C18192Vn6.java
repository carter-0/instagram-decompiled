package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vn6  reason: case insensitive filesystem */
public abstract class C18192Vn6 {
    public static final C347017w8 A00(Context context, UserSession userSession, List list, int i, boolean z, boolean z2) {
        List list2 = list;
        boolean A1Y = DbW.A1Y(list2);
        C16609Uy5 uy5 = C16609Uy5.DYNAMIC_REVEAL;
        int i2 = C17153VKf.A00;
        C306576Mr r6 = C306576Mr.DISABLED;
        int i3 = i;
        boolean z3 = z;
        Context context2 = context;
        C306576Mr r17 = r6;
        String str = "karaoke_caption_sticker_id";
        List list3 = list2;
        int i4 = i3;
        int i5 = i2;
        boolean z4 = z3;
        ArrayList A1L = 0sr.A1L(new AnonymousClass5MM[]{new C15911Ukb(context2, new UOC(uy5, r6, (Integer) null, (Integer) null, (Integer) null, "karaoke_caption_sticker_id", list2, i3, i2, z3), (C18439Vri) null), new C15908UkY(context2, new UOC(C16609Uy5.TYPEWRITER, r17, (Integer) null, (Integer) null, (Integer) null, str, list3, i4, i5, z4)), new C15912Ukc(context2, new UOC(C16609Uy5.CUBE_REVEAL, r17, (Integer) null, (Integer) null, (Integer) null, str, list3, i4, i5, z4), (C18439Vri) null)});
        if (z2) {
            A1L.add(new C15907UkX(context2, new UOC(C16609Uy5.KARAOKE, r17, (Integer) null, (Integer) null, (Integer) null, str, list3, i4, i5, z4), (C18439Vri) null));
        }
        A1L.add(0, new C15909UkZ(context2, new UOC(C16609Uy5.SIMPLE_LINE, r17, (Integer) null, (Integer) null, (Integer) null, str, list3, i4, i5, z4), (C18439Vri) null));
        A1L.add(A1Y ? 1 : 0, new C15910Uka(context2, new UOC(C16609Uy5.DYNAMIC_SIMPLE_LINE, r6, (Integer) null, (Integer) null, (Integer) null, "karaoke_caption_sticker_id", list2, i3, i2, z3), (C18439Vri) null));
        return new C347017w8(context2, userSession, 00k.A0a(A1L));
    }

    public static final AnonymousClass5MM A01(Context context, UOC uoc, C18439Vri vri) {
        0qQ.A0B(uoc, 1);
        C16609Uy5 uy5 = uoc.A02;
        switch (uy5.ordinal()) {
            case 0:
                return new C15909UkZ(context, uoc, vri);
            case 1:
                return new C15910Uka(context, uoc, vri);
            case 2:
                return new C15911Ukb(context, uoc, vri);
            case 3:
                return new C15908UkY(context, uoc);
            case 4:
                return new C15912Ukc(context, uoc, vri);
            case 5:
                return new C15907UkX(context, uoc, vri);
            default:
                throw C51973G9u.A0g(uy5, "Unhandled karaoke sticker style: ", new StringBuilder());
        }
    }
}
