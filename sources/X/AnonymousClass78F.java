package X;

import android.content.res.Resources;
import android.graphics.RectF;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.78F  reason: invalid class name */
public final class AnonymousClass78F implements AnonymousClass7DS {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new AnonymousClass9LB(this, 31));
    public final int A02;
    public final AnonymousClass7X8 A03;

    public AnonymousClass78F(UserSession userSession, AnonymousClass7X8 r4, int i) {
        0qQ.A0B(r4, 2);
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = i;
    }

    public final boolean A00(AnonymousClass752 r46, C3263876o r47) {
        List list;
        AnonymousClass75I r2;
        AnonymousClass752 r13 = r46;
        0qQ.A0B(r13, 0);
        C3263876o r1 = r47;
        0qQ.A0B(r1, 1);
        AnonymousClass7FU r22 = r13.A00;
        boolean BCL = r22.BCL();
        MessageIdentifier BSG = r13.BSG();
        AnonymousClass7X8 r7 = this.A03;
        if (!C70020Nvy.A00((C332927Wz) r7, BSG, BCL)) {
            C328667Fr r10 = r13.A03;
            AnonymousClass9J6 r4 = r10.A08;
            String str = r4.A01;
            if (str.length() > 0) {
                Uri A032 = 0cp.A03(str);
                0qQ.A07(A032);
                AnonymousClass75J r23 = r13.A05;
                ImageUrl imageUrl = null;
                if (r23 != null && !00l.A0d(str, "reaction=", false) && (r23 instanceof AnonymousClass75K)) {
                    str = A032.buildUpon().appendQueryParameter("reaction", ((AnonymousClass75K) r23).A01).build().toString();
                }
                View A012 = r1.A0D.A01();
                0qQ.A07(A012);
                GradientSpinner gradientSpinner = (GradientSpinner) A012;
                gradientSpinner.A04();
                AnonymousClass777 r3 = r10.A0F;
                String queryParameter = A032.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str2 = r10.A0V;
                if (str2 != null) {
                    this.A01.getValue();
                    String str3 = r4.A00;
                    int layoutPosition = r1.getLayoutPosition();
                    0qQ.A0B(str3, 0);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(TraceFieldType.ContentType, "ai_bot_reels_plugin");
                    linkedHashMap2.put("agent_id", str3);
                    linkedHashMap2.put("bot_response_id", str2);
                    linkedHashMap2.put("xma_tap_index", String.valueOf(layoutPosition));
                    linkedHashMap.putAll(linkedHashMap2);
                }
                C66902Mel A002 = C66903Mem.A00(this.A00);
                1Xv r0 = 1Xj.A0h;
                String A06 = 1Xv.A06(queryParameter);
                String str4 = r10.A0Y;
                A002.A00 = null;
                String str5 = 2FW.A1p.A00;
                if (0qQ.A0K(str4, str5)) {
                    02m r14 = A002.A01;
                    r14.markerStart(20128369);
                    A002.A00 = A06;
                    boolean z = false;
                    if (A06 != null) {
                        z = true;
                    }
                    r14.markerAnnotate(20128369, "tapped media id exist", z);
                    r14.markerPoint(20128369, "tapped_reel_in_thread");
                }
                C332847Wp r15 = (C332847Wp) r7;
                String str6 = r4.A00;
                MessageIdentifier BSG2 = r13.BSG();
                Long valueOf = Long.valueOf(r22.BSP());
                int i = this.A02;
                List singletonList = Collections.singletonList(queryParameter);
                0qQ.A07(singletonList);
                if (r3 == null || !(r3 instanceof AnonymousClass776)) {
                    list = null;
                } else {
                    list = Collections.singletonList(((AnonymousClass776) r3).A00);
                    0qQ.A07(list);
                }
                List singletonList2 = Collections.singletonList(r10.A0N);
                0qQ.A07(singletonList2);
                C68168N3i n3i = new C68168N3i(0nA.A0F(r1.A0V), 0.0f);
                if ((r23 instanceof AnonymousClass75I) && (r2 = (AnonymousClass75I) r23) != null) {
                    imageUrl = r2.A00;
                }
                String str7 = r10.A0T;
                C332847Wp r222 = r15;
                ImageUrl imageUrl2 = imageUrl;
                r222.Cqp((View) null, imageUrl2, n3i, BSG2, gradientSpinner, valueOf, valueOf, str, str6, str7, r10.A0U, str4, (String) null, ((C332877Wu) r7).C6X(), singletonList, list, singletonList2, (List) null, (List) null, linkedHashMap, i, r10.A0m);
                if (0qQ.A0K(str4, str5)) {
                    A002.A01.markerPoint(20128369, "navigate_to_reels_viewer");
                }
            } else {
                AnonymousClass755 r24 = r13.A04;
                if (r24 == null) {
                    return false;
                }
                if (r24 instanceof AnonymousClass756) {
                    C44046CTp cTp = ((AnonymousClass756) r24).A01;
                    if (cTp instanceof CHR) {
                        CHR chr = (CHR) cTp;
                        0qQ.A0B(chr, 0);
                        String str8 = chr.A02;
                        String str9 = chr.A03;
                        1Ns r5 = chr.A00;
                        String str10 = chr.A01;
                        View A013 = r1.A0D.A01();
                        0qQ.A07(A013);
                        GradientSpinner gradientSpinner2 = (GradientSpinner) A013;
                        gradientSpinner2.A04();
                        RectF A0F = 0nA.A0F(r1.A0V);
                        Resources resources = gradientSpinner2.getResources();
                        0qQ.A07(resources);
                        r7.CqX(A0F, new OMU(resources, gradientSpinner2), r13.BSG(), r5, str8, str9, str10, (String) null, r4.A00);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid PortraitXmaContentViewModel.NavigationFields: ");
                    sb.append(cTp);
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid PortraitXmaContentViewModel.Content: ");
                sb2.append(r24);
                throw new IllegalStateException(sb2.toString());
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        return A00((AnonymousClass752) obj, (C3263876o) obj2);
    }
}
