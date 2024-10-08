package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.LOb  reason: case insensitive filesystem */
public final class C64113LOb {
    public static final Map A09 = AnonymousClass7TE.A1H();
    public static final Map A0A = AnonymousClass7TE.A1H();
    public C309626Yz A00;
    public boolean A01;
    public boolean A02;
    public final C63731L4p A03;
    public final C16522UwR A04;
    public final String A05;
    public final ArrayList A06;
    public final ArrayList A07;
    public final UserSession A08;

    public C64113LOb(UserSession userSession, C63731L4p l4p) {
        0qQ.A0B(userSession, 2);
        this.A03 = l4p;
        this.A08 = userSession;
        this.A04 = C18241Vo8.A00(l4p.A00.A04);
        String str = this.A03.A00.A02;
        this.A05 = str == null ? "" : str;
        this.A06 = AnonymousClass7TE.A1C();
        this.A07 = AnonymousClass7TE.A1C();
    }

    public final void A00(SuperlativeMentionSticker... superlativeMentionStickerArr) {
        0qQ.A0B(superlativeMentionStickerArr, 0);
        ArrayList arrayList = this.A06;
        arrayList.clear();
        018.A18(arrayList, superlativeMentionStickerArr);
        Map map = A09;
        C16522UwR uwR = this.A04;
        Object obj = map.get(uwR);
        if (obj == null) {
            obj = AnonymousClass7TE.A1C();
            map.put(uwR, obj);
        }
        018.A18((Collection) obj, superlativeMentionStickerArr);
    }

    public final void A01(SuperlativeNotifyToUsers... superlativeNotifyToUsersArr) {
        0qQ.A0B(superlativeNotifyToUsersArr, 0);
        ArrayList arrayList = this.A07;
        arrayList.clear();
        018.A18(arrayList, superlativeNotifyToUsersArr);
        Map map = A0A;
        C16522UwR uwR = this.A04;
        Object obj = map.get(uwR);
        if (obj == null) {
            obj = AnonymousClass7TE.A1C();
            map.put(uwR, obj);
        }
        018.A18((Collection) obj, superlativeNotifyToUsersArr);
    }
}
