package X;

import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.HDx  reason: case insensitive filesystem */
public final class C54443HDx extends H4J {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54443HDx(0hq r1, Object obj, int i) {
        super(r1);
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r4) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(131878797);
                i = -542887547;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-1521433596);
                C59689JTv.A0D(DbT.A08(this.A01), "fetch_all_upcoming_events_failed");
                i = 1915274356;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-732160983);
                i = 645801682;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(578571841);
                i = -1096201883;
                break;
            default:
                A03 = AnonymousClass0fD.A03(337084236);
                C59689JTv.A07(((C64143LQf) this.A01).A01, 2131972232);
                i = 548724152;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            C54443HDx.super.onFinish();
            return;
        }
        int A03 = AnonymousClass0fD.A03(1943450487);
        super.onFinish();
        ((H1O) this.A01).A0E = false;
        AnonymousClass0fD.A0A(-1373996239, A03);
    }

    public final void onStart() {
        if (this.A00 != 0) {
            C54443HDx.super.onStart();
            return;
        }
        int A03 = AnonymousClass0fD.A03(-2131075643);
        super.onStart();
        ((H1O) this.A01).A0E = true;
        AnonymousClass0fD.A0A(-2059169586, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        ImageUrl imageUrl;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-100673249);
                SavedCollection savedCollection = (SavedCollection) obj;
                int A03 = AnonymousClass0fD.A03(1239119054);
                0qQ.A0B(savedCollection, 0);
                boolean A1V = AnonymousClass7TF.A1V(savedCollection.A05);
                0eE r4 = AnonymousClass0t1.A01;
                H1O h1o = (H1O) this.A01;
                AnonymousClass0eM r5 = h1o.A0V;
                C262184Cl r0 = DbX.A0l(r4, r5).A03;
                if (A1V) {
                    r0.EY4(true);
                } else {
                    r0.EYh(true);
                }
                AnonymousClass0eM r10 = h1o.A0I;
                DirectThreadKey directThreadKey = C51966G9m.A0q(r10).A01;
                String str = C51966G9m.A0q(r10).A06;
                if (!(directThreadKey == null || str == null)) {
                    1bJ.A00(AnonymousClass7TE.A0l(r5)).FKp(directThreadKey, str, 1);
                    DbX.A0R(r5).A00(new AnonymousClass7MK(directThreadKey));
                }
                if (AnonymousClass7TF.A1Z(h1o.A0O)) {
                    Boolean BC4 = DbX.A0l(r4, r5).A03.BC4();
                    if (BC4 != null && BC4.booleanValue()) {
                        H1O.A05(h1o, savedCollection);
                    }
                    C57078INs.A00(DbX.A0R(r5), savedCollection);
                    DbT.A1K(h1o);
                } else {
                    savedCollection.A09 = true;
                    1E8 A0d = DbX.A0d(r5);
                    1Xj A02 = A0d.A02(C51966G9m.A0q(r10).A05);
                    if (A02 != null) {
                        ArrayList A1D = AnonymousClass7TE.A1D(A02.A3i());
                        if (!A1D.contains(savedCollection.A0F)) {
                            A1D.add(savedCollection.A0F);
                        }
                        A02.EjB(C243373Ym.SAVED);
                        A02.A0C.EjC(A1D);
                        A0d.A01(A02, true, false);
                    }
                    FragmentActivity requireActivity = h1o.requireActivity();
                    Intent putExtra = new Intent().putExtra("DirectCollaborativeCollectionsConstants_new_created_collection", savedCollection);
                    if (A02 != null) {
                        imageUrl = A02.A1Q();
                    } else {
                        imageUrl = null;
                    }
                    requireActivity.setResult(-1, putExtra.putExtra("DirectCollaborativeCollectionsConstants_media_thumbnail_url", imageUrl));
                    DbT.A1J(h1o);
                }
                I33.A00(h1o, AnonymousClass7TE.A0l(r5), savedCollection);
                String A002 = C51966G9m.A0q(r10).A00();
                if (!(A002 == null || A002.length() == 0)) {
                    ((C56534I0f) h1o.A0K.getValue()).A01(savedCollection, true);
                }
                AnonymousClass0fD.A0A(715064819, A03);
                i2 = 1651933374;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-115651977);
                C342577op r13 = (C342577op) obj;
                int A0D = AnonymousClass7TG.A0D(r13, -80160876);
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = DbU.A0K(r13.A01).iterator();
                while (it.hasNext()) {
                    UpcomingEvent upcomingEvent = (UpcomingEvent) it.next();
                    C310266ai.A00(((C61942KSr) this.A01).A0G()).A01(upcomingEvent);
                    String id = upcomingEvent.getId();
                    if (id != null) {
                        A1C.add(id);
                    }
                }
                boolean isEmpty = A1C.isEmpty();
                C61942KSr kSr = (C61942KSr) this.A01;
                if (!isEmpty) {
                    C61942KSr.A01(kSr).A04((AnonymousClass4DU) null, new KTG(new M02(kSr, 2), A1C));
                } else {
                    C61942KSr.A09(kSr);
                }
                AnonymousClass0fD.A0A(-1782681804, A0D);
                i2 = -1809360727;
                break;
            case 2:
                i = AnonymousClass0fD.A03(638139215);
                int A032 = AnonymousClass0fD.A03(-2037210653);
                K7b.A00((K7b) this.A01);
                AnonymousClass0fD.A0A(-194679358, A032);
                i2 = -423982383;
                break;
            case 3:
                int A033 = AnonymousClass0fD.A03(231575592);
                int A034 = AnonymousClass0fD.A03(1078850360);
                C60969JuR juR = ((K7b) this.A01).A03;
                if (juR == null) {
                    0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    throw AnonymousClass00P.createAndThrow();
                }
                MediaPromptPrefType mediaPromptPrefType = juR.A00;
                MediaPromptPrefType mediaPromptPrefType2 = MediaPromptPrefType.ON;
                if (mediaPromptPrefType == mediaPromptPrefType2) {
                    mediaPromptPrefType2 = MediaPromptPrefType.OFF;
                }
                juR.A00 = mediaPromptPrefType2;
                AnonymousClass0fD.A0A(-1532619685, A034);
                AnonymousClass0fD.A0A(1510444649, A033);
                return;
            default:
                i = AnonymousClass0fD.A03(-2013708515);
                C342577op r132 = (C342577op) obj;
                int A0D2 = AnonymousClass7TG.A0D(r132, 70531154);
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it2 = DbU.A0K(r132.A01).iterator();
                while (it2.hasNext()) {
                    UpcomingEvent upcomingEvent2 = (UpcomingEvent) it2.next();
                    C310266ai.A00(((C64143LQf) this.A01).A03).A01(upcomingEvent2);
                    A1C2.add(upcomingEvent2.getId());
                }
                boolean A1b = DbT.A1b(A1C2);
                C64143LQf lQf = (C64143LQf) this.A01;
                if (A1b) {
                    lQf.A04.DVT(lQf.A05, A1C2);
                } else {
                    lQf.A04.DVS(lQf.A05, (UpcomingEvent) null);
                }
                AnonymousClass0fD.A0A(1072766474, A0D2);
                i2 = 299978052;
                break;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
