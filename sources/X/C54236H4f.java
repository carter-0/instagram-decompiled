package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.save.model.SavedCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.H4f  reason: case insensitive filesystem */
public final class C54236H4f extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C54236H4f(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj4;
        this.A04 = obj5;
        this.A01 = obj2;
        this.A05 = obj3;
    }

    public final void onFail(C268654dm r10) {
        int A032;
        int i;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-117401724);
                SQH.A01((0hq) this.A04);
                String A002 = AnonymousClass000.A00(2144);
                0wb.A03("AppStartupUtil", A002);
                C59689JTv.A0C((Context) this.A03, A002);
                i = 1150264531;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(359769757);
                SQH.A01((0hq) this.A04);
                0wb.A03("AppStartupUtil", "SingleMediaRequest onFail for navigation to insights");
                C59689JTv.A0C((Context) this.A03, "SingleMediaRequest onFail for navigation to insights");
                i = 976170972;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(-1340322703);
                ((Dialog) this.A03).dismiss();
                C59689JTv.A0C((Context) this.A01, "removeHighlightMedia_unknown_error_occured");
                i = 548510624;
                break;
            case 3:
                A032 = AnonymousClass0fD.A03(-898771422);
                C56669I6y.A06((Context) this.A03, (AnonymousClass0iw) this.A01, (UserSession) this.A05, (SavedCollection) this.A02, (List) this.A04);
                i = -1042323078;
                break;
            case 4:
                A032 = AnonymousClass0fD.A03(960190260);
                0lg r6 = (0lg) this.A05;
                List list = (List) this.A03;
                1Ng A003 = AnonymousClass1Nd.A00(r6);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C55116HcP.A00(r6, C243373Ym.NOT_SAVED, C243373Ym.SAVED, C51966G9m.A0t(it));
                }
                A003.A00(new C57077INr(C54665HMw.ALL_MEDIA_AUTO_COLLECTION, (String) null, list));
                Context context = (Context) this.A02;
                FdH fdH = new FdH(this, 7);
                1Xj A0T = DbZ.A0T(list, 0);
                int size = list.size();
                AnonymousClass7TF.A1B(context, 0, A0T);
                C310336ap A0a = DbS.A0a();
                A0a.A0D = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_unsave_failure_notification, size);
                C51970G9q.A1L(A0T, A0a);
                A0a.A0L = true;
                A0a.A0A(fdH);
                A0a.A0G = AnonymousClass7TF.A0d(context.getResources(), 2131972371);
                Dbb.A1Q(A0a);
                i = -1270687406;
                break;
            default:
                A032 = AnonymousClass0fD.A03(11872240);
                DbS.A1U(this.A02);
                i = -1820397874;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1684735352);
                C54236H4f.super.onStart();
                SQH.A02((0hq) this.A04);
                i2 = 1968550181;
                break;
            case 1:
                i = AnonymousClass0fD.A03(740685436);
                SQH.A02((0hq) this.A04);
                i2 = -838992307;
                break;
            case 2:
                i = AnonymousClass0fD.A03(126925277);
                AnonymousClass0fN.A00((Dialog) this.A03);
                i2 = 1662146467;
                break;
            case 5:
                i = AnonymousClass0fD.A03(890496473);
                C54236H4f.super.onStart();
                DbS.A1U(this.A03);
                i2 = 685499333;
                break;
            default:
                C54236H4f.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(1502432976);
                C54057Gyg gyg = (C54057Gyg) obj;
                int A033 = AnonymousClass0fD.A03(1348375665);
                C54236H4f.super.onSuccess(gyg);
                SQH.A01((0hq) this.A04);
                1Xj r3 = gyg.A00;
                ABC.A00((Bundle) this.A02, (FragmentActivity) this.A03, (UserSession) this.A05, r3);
                AnonymousClass0fD.A0A(236638082, A033);
                i = 122329678;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(-194885832);
                int A034 = AnonymousClass0fD.A03(1641746121);
                SQH.A01((0hq) this.A04);
                1Xj r32 = (1Xj) AnonymousClass7TE.A13(((1XO) obj).A06);
                if (r32 != null) {
                    C48899Elz.A00((AnonymousClass4D6) ((AnonymousClass4DJ) ((AnonymousClass0iw) this.A02)), (UserSession) this.A05, r32, C273654mx.A00(541));
                } else {
                    0wb.A03("AppStartupUtil", "null media fetched for navigation to insights");
                    C59689JTv.A0C((Context) this.A03, "null media fetched for navigation to insights");
                }
                AnonymousClass0fD.A0A(-948164073, A034);
                i = -1670556515;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(-1649838365);
                K14 k14 = (K14) obj;
                int A0D = AnonymousClass7TG.A0D(k14, 1111744759);
                ((Dialog) this.A03).dismiss();
                Reel reel = (Reel) this.A04;
                C64022LJj.A01(k14, (UserSession) this.A05, reel, AnonymousClass7TE.A1I(this.A02));
                if (k14.A00 != null) {
                    Context context = (Context) this.A01;
                    C59689JTv.A09(context, DbY.A0c(context, reel.A0r, 2131964349));
                }
                AnonymousClass0fD.A0A(-1229138617, A0D);
                i = 680688194;
                break;
            case 3:
                A032 = AnonymousClass0fD.A03(446928496);
                int A035 = AnonymousClass0fD.A03(2119748611);
                Context context2 = (Context) this.A03;
                SavedCollection savedCollection = (SavedCollection) this.A02;
                List list = (List) this.A04;
                1Xj r6 = (1Xj) AnonymousClass7TE.A13(list);
                int size = list.size();
                AnonymousClass7TG.A1T(context2, savedCollection, r6);
                C310336ap A0a = DbS.A0a();
                A0a.A0D = context2.getResources().getQuantityString(R.plurals.save_home_bulk_edit_add_success_notification, size, C51968G9o.A1Z(savedCollection.A0G, size));
                C51970G9q.A1L(r6, A0a);
                Dbb.A1Q(A0a);
                AnonymousClass0fD.A0A(-740659661, A035);
                i = -1029320484;
                break;
            case 4:
                A032 = AnonymousClass0fD.A03(-711132063);
                int A036 = AnonymousClass0fD.A03(-1457295806);
                Context context3 = (Context) this.A02;
                List list2 = (List) this.A03;
                1Xj A0T = DbZ.A0T(list2, 0);
                int size2 = list2.size();
                boolean A1U = AnonymousClass7TF.A1U(0, context3, A0T);
                C310336ap A0a2 = DbS.A0a();
                A0a2.A0D = DbY.A0d(context3.getResources(), size2, R.plurals.save_home_bulk_edit_unsave_success_notification);
                A0a2.A0O = A1U;
                C51970G9q.A1L(A0T, A0a2);
                Dbb.A1Q(A0a2);
                Runnable runnable = (Runnable) this.A04;
                if (runnable != null) {
                    runnable.run();
                }
                AnonymousClass0fD.A0A(304639725, A036);
                i = -1040110607;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-1860966156);
                NHN nhn = (NHN) obj;
                int A0D2 = AnonymousClass7TG.A0D(nhn, 1731172594);
                C70593OCq oCq = nhn.A01;
                1Xj r1 = nhn.A00;
                if (oCq != null) {
                    C51965G9l.A1W(this.A01, oCq);
                } else if (nhn.A03 == null || r1 == null) {
                    DbS.A1U(this.A02);
                } else {
                    ((0sL) this.A04).invoke(r1, nhn);
                    long j = C19226WQh.A04;
                    C17088VHk.A00((UserSession) this.A05).A00();
                }
                AnonymousClass0fD.A0A(1527126864, A0D2);
                i = -73672559;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
