package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jiq  reason: case insensitive filesystem */
public final class C60293Jiq extends 2YL {
    public final 05G A00;
    public final AnonymousClass0Ud A01;
    public final UserSession A02;
    public final String A03;
    public final Map A04 = AnonymousClass7TE.A1H();

    public final C60252Ji9 A02(BoostMediaPickerTabType boostMediaPickerTabType) {
        0qQ.A0B(boostMediaPickerTabType, 0);
        Map map = this.A04;
        C60252Ji9 ji9 = (C60252Ji9) map.get(boostMediaPickerTabType);
        if (ji9 == null) {
            UserSession userSession = this.A02;
            ji9 = new C60252Ji9(boostMediaPickerTabType, new C62035KWr(userSession), userSession, this.A03);
        }
        map.put(boostMediaPickerTabType, ji9);
        AnonymousClass7TE.A1Z(new MHC((Object) ji9, (Object) this, (AnonymousClass4D7) null, 49), C318116oQ.A00(this));
        return ji9;
    }

    public final void A04(C16492Uvn uvn) {
        int A022 = DbU.A02(uvn, 0);
        int i = 2;
        if (A022 == 0) {
            i = 1;
        } else if (A022 != 1) {
            throw AnonymousClass7TE.A1K();
        }
        WGU.A00(this.A02).A0R(C16678UzE.MEDIA_PICKER.toString(), 002.A0O("start_media_selection_", i));
    }

    public static final C60252Ji9 A00(C60293Jiq jiq) {
        C60252Ji9 ji9 = (C60252Ji9) jiq.A04.get(jiq.A01());
        if (ji9 == null) {
            return jiq.A02(jiq.A01());
        }
        return ji9;
    }

    public final BoostMediaPickerTabType A01() {
        Object obj;
        C61068Jw6 jw6 = (C61068Jw6) this.A01.getValue();
        int ordinal = ((C16492Uvn) jw6.A05).ordinal();
        if (ordinal == 0) {
            obj = jw6.A04;
        } else if (ordinal == 1) {
            obj = jw6.A03;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return (BoostMediaPickerTabType) obj;
    }

    public final List A03() {
        int ordinal = ((C16492Uvn) ((C61068Jw6) this.A01.getValue()).A05).ordinal();
        if (ordinal == 0) {
            return 0sr.A1P(new BoostMediaPickerTabType[]{BoostMediaPickerTabType.FEED, BoostMediaPickerTabType.STORY, BoostMediaPickerTabType.CLIPS});
        }
        if (ordinal == 1) {
            return AnonymousClass7TE.A1I(BoostMediaPickerTabType.FEED_AB_TEST);
        }
        throw AnonymousClass7TE.A1K();
    }

    public C60293Jiq(C16492Uvn uvn, UserSession userSession, String str) {
        AnonymousClass7TG.A1U(userSession, str, uvn);
        this.A02 = userSession;
        this.A03 = str;
        02z A10 = DbS.A10(new C61068Jw6(uvn));
        this.A00 = A10;
        this.A01 = 10b.A03(A10);
    }

    public final void A05(C16492Uvn uvn) {
        Object value;
        C61068Jw6 jw6;
        A04(uvn);
        05G r5 = this.A00;
        do {
            value = r5.getValue();
            jw6 = (C61068Jw6) value;
        } while (!r5.AIY(value, C61068Jw6.A00((BoostMediaPickerTabType) jw6.A04, (BoostMediaPickerTabType) jw6.A03, uvn, false, jw6.A01)));
        A00(this).A00();
    }
}
