package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

public final class OXM {
    public static PUI parseFromJson(16F r8) {
        C69340Njf njf;
        0qQ.A0B(r8, 0);
        try {
            PUI pui = new PUI();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                ArrayList arrayList = null;
                if (C41845B3m.A1E(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r8);
                    0qQ.A0B(A0l, 0);
                    pui.A01 = A0l;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r8);
                    0qQ.A0B(A0l2, 0);
                    pui.A02 = A0l2;
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C67365Mmh parseFromJson = C67364Mmg.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    pui.A04 = arrayList;
                } else if ("feed_type".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r8);
                    C69340Njf[] values = C69340Njf.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            njf = C69340Njf.UNKNOWN;
                            break;
                        }
                        njf = values[i];
                        if (0qQ.A0K(njf.A00, A0l3)) {
                            break;
                        }
                        i++;
                    }
                    pui.A00 = njf;
                }
                r8.A0z();
            }
            pui.A03 = 00k.A0U(C67393MnA.A00(C67394MnB.A00, pui.A04));
            return pui;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, PUI pui) {
        r4.A0c();
        r4.A0R(DialogModule.KEY_TITLE, pui.A01);
        r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, pui.A02);
        16P.A03(r4, DialogModule.KEY_ITEMS);
        for (C67365Mmh mmh : pui.A04) {
            if (mmh != null) {
                r4.A0c();
                if (mmh.A07 != null) {
                    r4.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                    User user = mmh.A07;
                    Parcelable.Creator creator = User.CREATOR;
                    1aC.A08(r4, user);
                }
                if (mmh.A06 != null) {
                    r4.A0q("place");
                    C18226Vnq.A00(r4, mmh.A06);
                }
                if (mmh.A03 != null) {
                    r4.A0q("hashtag");
                    C279594yt.A00(r4, mmh.A03);
                }
                if (mmh.A04 != null) {
                    r4.A0q("keyword");
                    C67385Mn1.A00(r4, mmh.A04);
                }
                if (mmh.A05 != null) {
                    r4.A0q("category");
                    C70896OQo.A00(r4, mmh.A05);
                }
                if (mmh.A01 != null) {
                    r4.A0q("licensed_music");
                    AnonymousClass3UP.A00(r4, mmh.A01);
                }
                if (mmh.A02 != null) {
                    r4.A0q("track_metadata");
                    D0F.A00(r4, mmh.A02);
                }
                if (mmh.A00 != null) {
                    r4.A0q("original_audio");
                    1dk.A00(r4, mmh.A00);
                }
                C66941Mfa.A00(r4, mmh);
                r4.A0Z();
            }
        }
        r4.A0Y();
        C69340Njf njf = pui.A00;
        if (njf != null) {
            r4.A0R("feed_type", njf.A00);
        }
        r4.A0Z();
    }
}
