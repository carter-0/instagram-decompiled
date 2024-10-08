package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.P3s  reason: case insensitive filesystem */
public final class C72379P3s implements MSJ {
    public final int A00;
    public final Object A01;

    public C72379P3s(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void FHK() {
        String str;
        Long A10;
        AnonymousClass4AB r2;
        switch (this.A00) {
            case 0:
                C61361K4d k4d = (C61361K4d) this.A01;
                C60299Jix A002 = C61361K4d.A00(k4d);
                boolean z = !DbX.A1a(C61361K4d.A00(k4d).A0C.getValue());
                AnonymousClass4JK r4 = A002.A02;
                ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = A002.A03;
                ContentNoteMetadata contentNoteMetadata = contentNotesImmersiveReplyContent.A02;
                String str2 = contentNoteMetadata.A08;
                String str3 = contentNotesImmersiveReplyContent.A07;
                GPK gpk = GPK.REPLY_SHEET;
                String str4 = contentNoteMetadata.A04;
                String str5 = contentNoteMetadata.A06;
                String str6 = contentNoteMetadata.A0A;
                Integer num = contentNoteMetadata.A03;
                String str7 = contentNoteMetadata.A05;
                Integer num2 = contentNoteMetadata.A02;
                if (z) {
                    r4.A02(gpk, num, num2, str2, str3, str4, str5, str6, str7);
                } else {
                    r4.A03(gpk, num, num2, str2, str3, str4, str5, str6, str7);
                }
                AnonymousClass7TF.A1O(A002.A0B, z);
                return;
            case 1:
                C71126OdL odL = (C71126OdL) this.A01;
                C67755MuA muA = odL.A0U;
                AnonymousClass0Ud r22 = muA.A09;
                Object value = r22.getValue();
                C69985NvP nvP = (C69985NvP) muA.A08.getValue();
                if (nvP instanceof C68770NWf) {
                    boolean A0K = 0qQ.A0K(r22.getValue(), "❤️");
                    ContentNoteMetadata contentNoteMetadata2 = ((C68770NWf) nvP).A05;
                    if (A0K) {
                        long j = muA.A00;
                        String str8 = muA.A06;
                        if (contentNoteMetadata2 != null) {
                            AnonymousClass4JK r7 = muA.A03;
                            String str9 = contentNoteMetadata2.A08;
                            String valueOf = String.valueOf(j);
                            r7.A03(GPK.REPLY_SHEET, contentNoteMetadata2.A03, contentNoteMetadata2.A02, str9, valueOf, contentNoteMetadata2.A04, contentNoteMetadata2.A06, contentNoteMetadata2.A0A, contentNoteMetadata2.A05);
                        } else {
                            muA.A04.A0E(j, str8);
                        }
                        muA.A07.Epw((Object) null);
                    } else {
                        long j2 = muA.A00;
                        String str10 = muA.A06;
                        if (contentNoteMetadata2 != null) {
                            AnonymousClass4JK r72 = muA.A03;
                            String str11 = contentNoteMetadata2.A08;
                            String valueOf2 = String.valueOf(j2);
                            r72.A02(GPK.REPLY_SHEET, contentNoteMetadata2.A03, contentNoteMetadata2.A02, str11, valueOf2, contentNoteMetadata2.A04, contentNoteMetadata2.A06, contentNoteMetadata2.A0A, contentNoteMetadata2.A05);
                        } else {
                            muA.A04.A0D(j2, str10);
                        }
                        muA.A07.Epw("❤️");
                        AnonymousClass2S0.A01.A04();
                    }
                }
                if (!"❤️".equals(value)) {
                    C3018660j.A01(odL.A0Q).A0E(C69506Nmo.A0O, (GT1) null, HOK.REPLY_SHEET, (Boolean) null, AnonymousClass7TE.A0v(), (Long) null, "❤️", odL.A0Z);
                    return;
                }
                return;
            default:
                NKO nko = (NKO) this.A01;
                C69027NdB ndB = (C69027NdB) nko.A0B.getValue();
                C319736r8 r3 = (C319736r8) nko.A08.getValue();
                0qQ.A0B(r3, 0);
                N4t n4t = ((C68279N8q) ndB.A0O()).A00;
                if (n4t != null && (str = n4t.A0A) != null && (A10 = AnonymousClass7TE.A10(str)) != null) {
                    long longValue = A10.longValue();
                    FriendMapRepository friendMapRepository = ndB.A01;
                    if (!friendMapRepository.A0B(longValue)) {
                        C3018760k A012 = C3018660j.A01(ndB.A00);
                        N4t n4t2 = ((C68279N8q) ndB.A0O()).A00;
                        if (!(n4t2 == null || (r2 = n4t2.A05) == null)) {
                            A012.A0J(r3, r2);
                        }
                        A012.A0E(C69506Nmo.A0O, (GT1) null, HOK.REPLY_SHEET, (Boolean) null, AnonymousClass7TE.A0v(), (Long) null, "❤️", (String) null);
                        friendMapRepository.A06(longValue);
                    } else {
                        friendMapRepository.A08.A0E(longValue, (String) null);
                        FriendMapRepository.A03(friendMapRepository, longValue, false);
                    }
                    ndB.A0R(C74107PpA.A00);
                    return;
                }
                return;
        }
    }
}
