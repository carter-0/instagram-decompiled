package com.instagram.contentnotes.data;

import X.05G;
import X.0Tu;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.182;
import X.1Hj;
import X.1as;
import X.1xC;
import X.2SP;
import X.AnonymousClass000;
import X.AnonymousClass1Ek;
import X.AnonymousClass1XT;
import X.AnonymousClass3GS;
import X.AnonymousClass4D7;
import X.AnonymousClass4JK;
import X.AnonymousClass4JM;
import X.AnonymousClass7TE;
import X.AnonymousClass7VT;
import X.AnonymousClass7VU;
import X.C239793Ih;
import X.C239803Ii;
import X.C254773t1;
import X.C254783t2;
import X.C268674do;
import X.C2809254t;
import X.C297815sO;
import X.C358278ae;
import X.C51966G9m;
import X.C51972G9s;
import X.C54348H8u;
import X.C58823Iy8;
import X.C60340gF;
import X.C63772L6e;
import X.GPK;
import X.I8Y;
import X.LAQ;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.contentnotes.data.ContentNotesRepository$postNote$1", f = "ContentNotesRepository.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
public final class ContentNotesRepository$postNote$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GPK A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ AnonymousClass4JK A04;
    public final /* synthetic */ NoteAudience A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentNotesRepository$postNote$1(GPK gpk, ImageUrl imageUrl, AnonymousClass4JK r5, NoteAudience noteAudience, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AnonymousClass4D7 r17, int i) {
        super(2, r17);
        this.A04 = r5;
        this.A0D = str;
        this.A0F = str2;
        this.A05 = noteAudience;
        this.A08 = str3;
        this.A02 = gpk;
        this.A0B = str4;
        this.A0E = str5;
        this.A07 = num;
        this.A09 = str6;
        this.A06 = num2;
        this.A0A = str7;
        this.A01 = i;
        this.A0C = str8;
        this.A03 = imageUrl;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.contentnotes.data.ContentNotesRepository$postNote$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r20) {
        AnonymousClass4JK r4 = this.A04;
        String str = this.A0D;
        String str2 = this.A0F;
        NoteAudience noteAudience = this.A05;
        String str3 = this.A08;
        GPK gpk = this.A02;
        String str4 = this.A0B;
        String str5 = this.A0E;
        Integer num = this.A07;
        String str6 = this.A09;
        Integer num2 = this.A06;
        String str7 = this.A0A;
        int i = this.A01;
        return new ContentNotesRepository$postNote$1(gpk, this.A03, r4, noteAudience, num, num2, str, str2, str3, str4, str5, str6, str7, this.A0C, r20, i);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.contentnotes.data.ContentNotesRepository$postNote$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Long A10;
        Object value;
        List<User> list;
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            AnonymousClass4JK r2 = this.A04;
            UserSession userSession = r2.A00;
            AnonymousClass4JM r15 = r2.A01;
            String valueOf = String.valueOf(2SP.A01.A09(0, Long.MAX_VALUE));
            String str = this.A0D;
            String str2 = this.A0F;
            NoteAudience noteAudience = this.A05;
            String str3 = this.A08;
            GPK gpk = this.A02;
            String str4 = this.A0B;
            String str5 = this.A0E;
            Integer num = this.A07;
            String str6 = this.A09;
            Integer num2 = this.A06;
            Integer num3 = num;
            NoteAudience noteAudience2 = noteAudience;
            AnonymousClass4JM r18 = r15;
            UserSession userSession2 = userSession;
            GPK gpk2 = gpk;
            C54348H8u h8u = new C54348H8u(gpk2, userSession2, r18, noteAudience2, num3, num2, valueOf, str, str2, str3, str4, str5, str6, this.A0A);
            this.A00 = 1;
            obj2 = h8u.A00(this);
            if (obj2 == obj3) {
                return obj3;
            }
        }
        C239803Ii r22 = (C239803Ii) obj2;
        if (r22 instanceof C239793Ih) {
            Object A0m = C51972G9s.A0m(r22);
            0qQ.A07(A0m);
            C2809254t r6 = (C2809254t) A0m;
            String str7 = r6.A07;
            if (!(str7 == null || (A10 = AnonymousClass7TE.A10(str7)) == null)) {
                long longValue = A10.longValue();
                AnonymousClass4JK r4 = this.A04;
                05G r3 = r4.A03;
                do {
                    value = r3.getValue();
                    ((Number) value).longValue();
                } while (!r3.AIY(value, A10));
                UserSession userSession3 = r4.A00;
                if (182.A06(0Tu.A05, userSession3, 36323161193065395L) && (list = r6.A0B) != null && !list.isEmpty()) {
                    String str8 = this.A0F;
                    String str9 = this.A0C;
                    ImageUrl imageUrl = this.A03;
                    for (User user : list) {
                        1as r23 = 1as.A04;
                        0qQ.A07(r23);
                        String username = user.getUsername();
                        boolean A0I = r23.A0I(userSession3, new DirectShareTarget(user));
                        0qQ.A0B(str8, 1);
                        DirectShareTarget directShareTarget = new DirectShareTarget(user);
                        if (directShareTarget.A01() instanceof C254773t1) {
                            AnonymousClass7VU A002 = AnonymousClass7VT.A00(userSession3);
                            C254783t2 A012 = directShareTarget.A01();
                            0qQ.A0C(A012, AnonymousClass000.A00(30));
                            A002.A02((C254773t1) A012, C51966G9m.A1J(directShareTarget.A0Q), new C58823Iy8(userSession3, imageUrl, directShareTarget, user, str8, username, str8, str9, longValue, A0I), true);
                        }
                    }
                }
            }
        } else if (r22 instanceof C297815sO) {
            Object obj4 = ((C297815sO) r22).A00;
            if (obj4 instanceof C268674do) {
                int i = this.A01;
                0qQ.A0C(obj4, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MediaNoteResponse>>");
                String errorMessage = ((AnonymousClass1XT) ((C268674do) obj4).A00).getErrorMessage();
                if (!(errorMessage == null || errorMessage.length() == 0)) {
                    1xC.A01.A00(new AnonymousClass3GS(new LAQ(new C63772L6e(I8Y.A00, (C358278ae) null, 2131968772), (C63772L6e) null, (C63772L6e) null, true, errorMessage, i, -1)));
                }
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentNotesRepository$postNote$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
