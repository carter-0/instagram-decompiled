package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.375  reason: invalid class name */
public final class AnonymousClass375 extends 1P0 {
    public final /* synthetic */ C228102kn A00;

    public AnonymousClass375(C228102kn r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(253375898);
        C2372736z r11 = (C2372736z) obj;
        int A032 = AnonymousClass0fD.A03(131849863);
        0qQ.A0B(r11, 0);
        ReelStore A05 = 1OP.A05(this.A00.A07);
        AnonymousClass3Iw r0 = r11.A00;
        if (r0 == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw AnonymousClass00P.createAndThrow();
        }
        List<HallpassDetailsDict> list = ((C239933Iv) r0).A00;
        A05.A04 = new ArrayList();
        for (HallpassDetailsDict hallpassDetailsDict : list) {
            Reel reel = new Reel((1Ns) null, 002.A0R("election:hallpass", hallpassDetailsDict.BAL()), false);
            reel.A08 = hallpassDetailsDict;
            reel.A0r = hallpassDetailsDict.getName();
            A05.A04.add(reel);
        }
        if (list.isEmpty()) {
            1Av A002 = 1Au.A00(A05.A09);
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = A002.A01.AR4();
            AR4.E5c("group_stories_cold_fetch_last_time", currentTimeMillis);
            AR4.apply();
        }
        AnonymousClass1Nd.A00(A05.A09).A05(new AnonymousClass376((1OE) null, A05.A0U(false), -1, false));
        AnonymousClass0fD.A0A(652608870, A032);
        AnonymousClass0fD.A0A(829443683, A03);
    }
}
