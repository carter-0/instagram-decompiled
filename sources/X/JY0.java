package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.gallery.suggestions.database.SuggestionsDBHelper;
import com.instagram.gallery.suggestions.database.SuggestionsDatabase;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.webrtc.CameraCapturer;

public final class JY0 {
    public final JY2 A00;
    public final JY3 A01;
    public final JY1 A02;

    public JY0(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A02 = new JY1(context, userSession);
        JY2 jy2 = new JY2(userSession);
        this.A00 = jy2;
        this.A01 = (JY3) userSession.A01(JY3.class, new C58695Iw4(17, (Object) context, (Object) userSession, (Object) jy2));
    }

    public final List A00(AnonymousClass9IE r39) {
        Cursor A002;
        Integer num;
        Boolean bool;
        String str;
        if (!0qQ.A0K(Looper.getMainLooper(), Looper.myLooper())) {
            JY3 jy3 = this.A01;
            List<C390879rz> list = (List) r39.A00;
            00k.A0P(",", "", "", list, (0sP) null);
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            for (C390879rz r3 : list) {
                Map map = jy3.A05;
                0sn r6 = (List) map.get(r3);
                if (r6 == null || r6.isEmpty()) {
                    UserSession userSession = jy3.A01;
                    String name = r3.name();
                    boolean A1U = AnonymousClass7TF.A1U(0, userSession, name);
                    C65607Lwi lwi = SuggestionsDatabase.A00;
                    Class<SuggestionsDatabase> cls = SuggestionsDatabase.class;
                    IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                    if (igRoomDatabase == null) {
                        synchronized (lwi) {
                            igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                            if (igRoomDatabase == null) {
                                1VA A0F = JTS.A0F(userSession, lwi, cls);
                                1VC.A00(A0F, 1771825795, 1771825795, false);
                                igRoomDatabase = JTS.A0W(A0F, userSession, cls);
                            }
                        }
                    }
                    C64086LMe A003 = ((SuggestionsDatabase) igRoomDatabase).A00();
                    1WY A0M = JTO.A0M("SELECT * FROM suggestions WHERE suggestion_mode = ?", A1U ? 1 : 0);
                    A0M.ADh(A1U, name);
                    C251983oI r1 = A003.A01;
                    C251983oI r37 = r1;
                    r37.assertNotSuspendingTransaction();
                    r37.beginTransaction();
                    try {
                        A002 = 1wT.A00(r1, A0M, A1U);
                        int A012 = 1Wd.A01(A002, "suggestion_id");
                        int A013 = 1Wd.A01(A002, DialogModule.KEY_TITLE);
                        int A014 = 1Wd.A01(A002, "subtitle");
                        int A015 = 1Wd.A01(A002, "concept");
                        int A016 = 1Wd.A01(A002, TraceFieldType.StartTime);
                        int A017 = 1Wd.A01(A002, "end_time");
                        int A018 = 1Wd.A01(A002, AnonymousClass000.A00(4073));
                        int A019 = 1Wd.A01(A002, "trip");
                        int A0110 = 1Wd.A01(A002, "location");
                        HashMap A1E = AnonymousClass7TE.A1E();
                        while (A002.moveToNext()) {
                            String string = A002.getString(A012);
                            if (!A1E.containsKey(string)) {
                                A1E.put(string, AnonymousClass7TE.A1C());
                            }
                        }
                        A002.moveToPosition(-1);
                        C64086LMe.A00(A003, A1E);
                        ArrayList A0o = AnonymousClass7TF.A0o(A002);
                        while (A002.moveToNext()) {
                            String string2 = A002.getString(A012);
                            String string3 = A002.getString(A013);
                            String string4 = A002.getString(A014);
                            String string5 = A002.getString(A015);
                            long j = A002.getLong(A016);
                            long j2 = A002.getLong(A017);
                            String string6 = A002.getString(A018);
                            if (A002.isNull(A019)) {
                                num = null;
                            } else {
                                num = Integer.valueOf(A002.getInt(A019));
                            }
                            if (num == null) {
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(AnonymousClass7TF.A1P(num.intValue()));
                            }
                            if (A002.isNull(A0110)) {
                                str = null;
                            } else {
                                str = A002.getString(A0110);
                            }
                            A0o.add(new N4R(new C63893LAw(bool, string2, string3, string4, string5, string6, str, j, j2), (List) (ArrayList) A1E.get(A002.getString(A012))));
                        }
                        r37.setTransactionSuccessful();
                        A002.close();
                        A0M.A00();
                        r37.endTransaction();
                        r6 = AnonymousClass7TE.A1C();
                        Iterator it = A0o.iterator();
                        while (it.hasNext()) {
                            N4R n4r = (N4R) it.next();
                            C63893LAw lAw = (C63893LAw) n4r.A02;
                            Context context = jy3.A00;
                            List<C63770L6c> list2 = (List) n4r.A00;
                            ArrayList A0p2 = AnonymousClass7TF.A0p(list2);
                            for (C63770L6c l6c : list2) {
                                A0p2.add(l6c.A01);
                            }
                            ArrayList A1F = 0Yv.A1F(C242173Sx.A07(C63275KuK.A00(context, A0p2, CameraCapturer.OPEN_CAMERA_DELAY_MS, 0)));
                            if (A1F.size() != list2.size()) {
                                SuggestionsDBHelper.A00(userSession, lAw.A06);
                            } else {
                                String str2 = lAw.A08;
                                String str3 = lAw.A05;
                                0sn r34 = 0sn.A00;
                                r6.add(new C60998Juu(r3, C62523KhF.valueOf(lAw.A03), (C62511Kh1) null, lAw.A02, str2, str3, lAw.A04, A1F, r34, AnonymousClass7TF.A0y(Long.valueOf(lAw.A01), lAw.A00)));
                            }
                        }
                        if (AnonymousClass7TE.A1b(r6)) {
                            r6.size();
                            map.put(r3, JY3.A00(jy3, r6));
                        } else {
                            r6 = 0sn.A00;
                        }
                    } catch (Throwable th) {
                        r37.endTransaction();
                        throw th;
                    }
                } else {
                    r6.size();
                }
                A0p.add(r6);
            }
            ListIterator A18 = C51968G9o.A18(A0p);
            if (A18.hasPrevious()) {
                Object previous = A18.previous();
                while (A18.hasPrevious()) {
                    previous = 00k.A0S((Iterable) previous, (Collection) A18.previous());
                }
                List<C60998Juu> list3 = (List) previous;
                ArrayList A0p3 = AnonymousClass7TF.A0p(list3);
                for (C60998Juu juu : list3) {
                    A0p3.add(new C381559bx(juu.A02, juu.A00(), juu.A06, juu.A05, juu.A04, juu.A07, juu.A09, juu.A08));
                }
                return A0p3;
            }
            throw AnonymousClass7TE.A1B("Empty list can't be reduced.");
        }
        throw AnonymousClass7TE.A0z("SuggestionsProviderV2.getSuggestions cannot be called on main thread");
    }
}
