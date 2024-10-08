package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.Place;
import com.facebook.locationsharing.core.models.PointOfInterest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FNk  reason: case insensitive filesystem */
public final class C50069FNk implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C50069FNk(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        boolean z;
        UHR uhr;
        Address address;
        SIV siv;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(1117767881);
                AnonymousClass37E r2 = AnonymousClass37D.A00;
                ES2 es2 = (ES2) this.A01;
                C331157Pu A002 = C48943Emh.A00(r2.A01(es2.requireActivity()));
                if (A002 != null) {
                    boolean z2 = true;
                    if (!this.A02 || (!es2.A03 && !es2.A05)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!this.A03 || !es2.A04) {
                        z2 = false;
                    }
                    String str = es2.A01;
                    Boolean valueOf = Boolean.valueOf(es2.A03);
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putBoolean("show_text_translations_error_rows", z);
                    A0a.putBoolean("show_voice_translations_error_rows", z2);
                    A0a.putString("translation_error_media_id", str);
                    A0a.putBoolean("has_closed_caption_translations", AnonymousClass7TG.A1X(valueOf));
                    E21 e21 = new E21();
                    e21.setArguments(A0a);
                    C331127Pr A0f = DbX.A0f(es2.A06);
                    DbZ.A0z(es2.requireContext(), A0f, 2131972217);
                    A002.A0F(e21, A0f);
                }
                i = 1465920094;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-1020561988);
                C15931Ukw ukw = (C15931Ukw) this.A01;
                IgdsButton igdsButton = ukw.A04;
                if (igdsButton != null) {
                    igdsButton.setLoading(true);
                }
                if (this.A02) {
                    uhr = ukw.A02;
                    if (uhr != null) {
                        address = UHR.A00(uhr).A02;
                        if (address != null) {
                            UHS.A04(uhr, (Object) null, "LOADING");
                            siv = uhr.A05;
                            i2 = 1;
                        }
                        i = 1506548039;
                        break;
                    }
                    0qQ.A0F("locationSharingPresenter");
                    throw AnonymousClass00P.createAndThrow();
                }
                boolean z3 = this.A03;
                uhr = ukw.A02;
                if (z3) {
                    if (uhr != null) {
                        int i3 = UHR.A00(uhr).A00;
                        ImmutableList immutableList = UHR.A00(uhr).A07;
                        if (i3 >= 0 && i3 < immutableList.size()) {
                            PointOfInterest pointOfInterest = (PointOfInterest) immutableList.get(i3);
                            String str2 = pointOfInterest.A02;
                            if (!TextUtils.isEmpty(str2)) {
                                String str3 = pointOfInterest.A04;
                                if (!TextUtils.isEmpty(str3)) {
                                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                                        throw AnonymousClass7TE.A0w("\"pointOfInterest\" must pass \"isPlace()\"");
                                    }
                                    C11367SPk.A03(str2, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                    Location location = pointOfInterest.A00;
                                    C11367SPk.A03(location, "location");
                                    C11367SPk.A03(str3, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    Place place = new Place(location, str2, str3);
                                    UHS.A04(uhr, (Object) null, "LOADING");
                                    SIV siv2 = uhr.A05;
                                    DirectShareTarget directShareTarget = siv2.A01;
                                    if (directShareTarget != null) {
                                        AnonymousClass7Z7 A003 = AnonymousClass1pH.A00().E52(siv2.A00).A00(directShareTarget);
                                        String str4 = place.A00;
                                        0qQ.A07(str4);
                                        A003.ELw((C317966o8) null, directShareTarget, str4, place.A01, "", C273654mx.A00(803), false);
                                    }
                                    UHS.A04(uhr, (Object) null, "LOADED");
                                    UHR.A01(uhr);
                                }
                            }
                            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(pointOfInterest.A04)) {
                                String str5 = pointOfInterest.A01;
                                C11367SPk.A03(str5, AnonymousClass000.A00(1558));
                                Location location2 = pointOfInterest.A00;
                                C11367SPk.A03(location2, "location");
                                address = new Address(location2, str5);
                                UHS.A04(uhr, (Object) null, "LOADING");
                                siv = uhr.A05;
                                i2 = 2;
                            } else {
                                throw AnonymousClass7TE.A0w("\"pointOfInterest\" must pass \"isAddress()\"");
                            }
                        }
                        i = 1506548039;
                    }
                    0qQ.A0F("locationSharingPresenter");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (uhr != null) {
                    uhr.A09(C15931Ukw.A0C);
                    i = 1506548039;
                }
                0qQ.A0F("locationSharingPresenter");
                throw AnonymousClass00P.createAndThrow();
                siv.A01(new C18981WFi(uhr, i2), address);
                i = 1506548039;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-1809297400);
                boolean z4 = this.A02;
                FF7 ff7 = (FF7) this.A01;
                if (!z4) {
                    C48142EZk eZk = C48142EZk.SYSTEM_SHARE_SHEET;
                    boolean z5 = this.A03;
                    UserSession userSession = ff7.A04;
                    C48145EZn eZn = C48145EZn.SETTINGS_AND_PRIVACY;
                    C49947FGb.A03(eZn, eZk, userSession, z5);
                    F8M.A01(ff7.A02, eZn, eZk, userSession, AnonymousClass05K.A15, (String) null);
                    FF7.A00(ff7, (Object) null, "system_share_sheet");
                    i = -3687477;
                    break;
                } else {
                    FF7.A01(ff7, "invite_friends");
                    i = -5336414;
                    break;
                }
            default:
                A05 = AnonymousClass0fD.A05(-212538791);
                boolean z6 = this.A02;
                FF7 ff72 = (FF7) this.A01;
                if (!z6) {
                    C48142EZk eZk2 = C48142EZk.WHATSAPP;
                    boolean z7 = this.A03;
                    UserSession userSession2 = ff72.A04;
                    C48145EZn eZn2 = C48145EZn.SETTINGS_AND_PRIVACY;
                    C49947FGb.A03(eZn2, eZk2, userSession2, z7);
                    F8M.A01(ff72.A02, eZn2, eZk2, userSession2, AnonymousClass05K.A1F, (String) null);
                    FF7.A00(ff72, (Object) null, "whatsapp");
                    i = 1553478010;
                    break;
                } else {
                    FF7.A01(ff72, "invite_friends");
                    i = 1217850937;
                    break;
                }
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
