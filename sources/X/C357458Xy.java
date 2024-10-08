package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;
import java.util.Set;

/* renamed from: X.8Xy  reason: invalid class name and case insensitive filesystem */
public final class C357458Xy {
    public final C40410Abh A00(Context context, ACRType aCRType, ClipsTemplateModel clipsTemplateModel, UserSession userSession, C353828Ji r63, TargetViewSizeProvider targetViewSizeProvider, C3499582p r65, AnonymousClass8DO r66, C354048Kl r67, C366678pU r68, C366688pV r69, AnonymousClass9P8 r70, AnonymousClass831 r71, AnonymousClass3QO r72, AudioOverlayTrack audioOverlayTrack, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, Set set, C62320sa r87, C62320sa r88, C62320sa r89, C62320sa r90, C62320sa r91, C62320sa r92, C62320sa r93, C62320sa r94, C62320sa r95, 0sP r96, boolean z, boolean z2, boolean z3, boolean z4) {
        MusicBrowseCategory musicBrowseCategory;
        String str8 = str;
        0qQ.A0B(str8, 3);
        Integer num2 = num;
        0qQ.A0B(num2, 5);
        Set set2 = set;
        0qQ.A0B(set2, 6);
        C62320sa r54 = r87;
        0qQ.A0B(r54, 9);
        C366688pV r25 = r69;
        0qQ.A0B(r25, 10);
        String str9 = str2;
        0qQ.A0B(str9, 13);
        C62320sa r53 = r88;
        0qQ.A0B(r53, 17);
        C62320sa r22 = r89;
        0qQ.A0B(r22, 19);
        C3499582p r56 = r65;
        0qQ.A0B(r56, 20);
        C62320sa r4 = r90;
        0qQ.A0B(r4, 21);
        C353828Ji r57 = r63;
        0qQ.A0B(r57, 22);
        AnonymousClass8DO r26 = r66;
        0qQ.A0B(r26, 23);
        C354048Kl r16 = r67;
        0qQ.A0B(r16, 24);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 25);
        String str10 = str4;
        0qQ.A0B(str10, 26);
        C62320sa r6 = r91;
        0qQ.A0B(r6, 27);
        0sP r19 = r96;
        0qQ.A0B(r19, 28);
        C62320sa r1 = r92;
        0qQ.A0B(r1, 29);
        C62320sa r21 = r93;
        0qQ.A0B(r21, 30);
        C62320sa r20 = r94;
        0qQ.A0B(r20, 31);
        C62320sa r18 = r95;
        0qQ.A0B(r18, 32);
        List list4 = list3;
        0qQ.A0B(list4, 42);
        C3499482o r8 = r56.A02;
        C349307zv A04 = r8.A01.A04();
        if (A04 != null) {
            AnonymousClass9J6 r12 = (AnonymousClass9J6) r1.invoke();
            UserSession userSession2 = userSession;
            PendingMediaStore A00 = 28K.A00(userSession2);
            0sn r0 = (List) r6.invoke();
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            Context context2 = context;
            C39716A6h a6h = new C39716A6h(context2, userSession2, str10, r0);
            0sn r02 = (List) r6.invoke();
            if (r02 == null) {
                r02 = 0sn.A00;
            }
            A5E a5e = new A5E(userSession2, r02);
            String str11 = (String) r4.invoke();
            Context applicationContext = context2.getApplicationContext();
            0qQ.A07(applicationContext);
            A5C a5c = new A5C((C3500482z) userSession2.A01(C3500482z.class, new C377429Lu(19, applicationContext, userSession2)), str8);
            A5D a5d = new A5D(userSession2, context2);
            0sL r42 = new C377449Lw(3, context2, userSession2);
            C377429Lu r3 = new C377429Lu(20, context2, A04);
            AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
            if (audioOverlayTrack != null) {
                musicBrowseCategory = audioOverlayTrack2.A09;
            } else {
                musicBrowseCategory = null;
            }
            int Au0 = r16.Au0();
            String str12 = r12.A00;
            String str13 = r12.A01;
            A89 a89 = new A89((C48143EZl) r18.invoke(), (293) r20.invoke(), aCRType, userSession2, targetViewSizeProvider2, r8, r26, r25, musicBrowseCategory, A04, num2, str12, str13, set2, Au0, z, z4);
            0sL r03 = new C377599Ml(str9, userSession2, 1);
            List list5 = list;
            String str14 = str7;
            String str15 = str6;
            String str16 = str5;
            String str17 = str3;
            ClipsTemplateModel clipsTemplateModel2 = clipsTemplateModel;
            C366678pU r23 = r68;
            AnonymousClass9P8 r24 = r70;
            AnonymousClass831 r31 = r71;
            AnonymousClass3QO r32 = r72;
            Boolean bool2 = bool;
            C39716A6h a6h2 = a6h;
            A5C a5c2 = a5c;
            A5D a5d2 = a5d;
            A5E a5e2 = a5e;
            String str18 = str11;
            List list6 = list4;
            C62320sa r43 = r54;
            C377429Lu r44 = r3;
            AnonymousClass9LJ r45 = new AnonymousClass9LJ(userSession2, 48);
            C62320sa r46 = r53;
            C62320sa r47 = r22;
            0sP r48 = r19;
            0sL r49 = r42;
            0sL r50 = r03;
            return new C40410Abh(context2, clipsTemplateModel2, userSession2, (CropInfo) r21.invoke(), r57, r56, r23, r24, AnonymousClass8A1.A01(userSession2), a6h2, a5c2, a5d2, a89, a5e2, r31, r32, A00, bool2, str18, str17, str16, str15, str14, list5, list2, list6, r43, r44, r45, r46, r47, r48, r49, r50, z2, z3);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
