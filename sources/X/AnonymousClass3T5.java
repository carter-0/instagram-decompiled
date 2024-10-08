package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;
import java.io.FilenameFilter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3T5  reason: invalid class name */
public final class AnonymousClass3T5 extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PendingMediaStore A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3T5(Context context, PendingMediaStore pendingMediaStore) {
        super(169, 5, false, false);
        this.A01 = pendingMediaStore;
        this.A00 = context;
    }

    public final void run() {
        File[] listFiles;
        File file;
        String str;
        List<C282745Eo> list;
        String str2;
        List<AnonymousClass51M> list2;
        List<C282745Eo> list3;
        C2802350v A002;
        List<String> B5h;
        String str3;
        PendingMediaStore pendingMediaStore = this.A01;
        Context context = this.A00;
        AnonymousClass454 A003 = AnonymousClass454.A00(context);
        0qQ.A07(A003);
        UserSession userSession = pendingMediaStore.A05;
        0Tu r7 = 0Tu.A05;
        182.A01(r7, userSession, 36604266802582567L);
        AnonymousClass4B2 r3 = new AnonymousClass4B2(A003, pendingMediaStore);
        Set set = pendingMediaStore.A09;
        PendingMediaStore.A00(r3, AnonymousClass1F2.A00().AXT((1LJ) null, 811671523), (FilenameFilter) null, set);
        PendingMediaStore.A00(r3, AnonymousClass457.A03(), (FilenameFilter) null, set);
        File AXT = AnonymousClass1F2.A00().AXT((1LJ) null, 1559854576);
        if (AXT.isDirectory()) {
            PendingMediaStore.A00(r3, AXT, (FilenameFilter) null, set);
        }
        File file2 = AnonymousClass457.A03;
        if (file2 == null) {
            file2 = AnonymousClass1F2.A00().CGg((1LJ) null, 1460857084);
            AnonymousClass457.A03 = file2;
        }
        PendingMediaStore.A00(r3, file2, (FilenameFilter) null, set);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map map = pendingMediaStore.A06;
        for (AnonymousClass3Q2 r8 : map.values()) {
            String str4 = r8.A3V;
            if (str4 != null) {
                String name = new File(str4).getName();
                0qQ.A07(name);
                linkedHashSet.add(name);
            }
            for (String file3 : (Set) r8.A0j.A00) {
                String name2 = new File(file3).getName();
                0qQ.A07(name2);
                linkedHashSet.add(name2);
            }
            String str5 = r8.A3m;
            if (str5 != null) {
                String name3 = new File(str5).getName();
                0qQ.A07(name3);
                linkedHashSet.add(name3);
            }
            ClipInfo clipInfo = r8.A1N;
            if (!(clipInfo == null || (str3 = clipInfo.A0F) == null)) {
                String name4 = new File(str3).getName();
                0qQ.A07(name4);
                linkedHashSet.add(name4);
            }
            if (((r8.A0m() && 182.A06(0Tu.A06, userSession, 36323225617050631L)) || 182.A06(r7, userSession, 36322482587707604L)) && (list3 = r8.A4a) != null) {
                for (C282745Eo r0 : list3) {
                    AnonymousClass513 r02 = r0.A04;
                    if (!(r02 == null || (A002 = r02.A00()) == null || (B5h = A002.B5h()) == null)) {
                        for (String file4 : B5h) {
                            String name5 = new File(file4).getName();
                            0qQ.A07(name5);
                            linkedHashSet.add(name5);
                        }
                    }
                }
            }
            if (182.A06(r7, userSession, 36324007301099173L)) {
                AnonymousClass51W r03 = r8.A1P;
                if (!(r03 == null || (list2 = (List) r03.A06.getValue()) == null)) {
                    for (AnonymousClass51M r04 : list2) {
                        String name6 = new File(r04.A0F.A0F).getName();
                        0qQ.A07(name6);
                        linkedHashSet.add(name6);
                    }
                }
                List<C266684aA> list4 = r8.A4J;
                if (list4 != null) {
                    for (C266684aA r05 : list4) {
                        String str6 = r05.A0C;
                        if (str6 != null) {
                            String name7 = new File(str6).getName();
                            0qQ.A07(name7);
                            linkedHashSet.add(name7);
                        }
                    }
                }
            }
        }
        for (String file5 : pendingMediaStore.A08) {
            String name8 = new File(file5).getName();
            0qQ.A07(name8);
            linkedHashSet.add(name8);
        }
        PendingMediaStore.A00(r3, (File) AnonymousClass45D.A01.getValue(), (FilenameFilter) null, linkedHashSet);
        File CGg = AnonymousClass1F2.A00().CGg((1LJ) null, 1475200931);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (AnonymousClass3Q2 r06 : map.values()) {
            ClipInfo clipInfo2 = r06.A1N;
            if (!(clipInfo2 == null || (str2 = clipInfo2.A0F) == null || !CGg.equals(new File(str2).getParentFile()))) {
                String name9 = new File(str2).getName();
                0qQ.A07(name9);
                linkedHashSet2.add(name9);
            }
        }
        PendingMediaStore.A00(r3, AnonymousClass1F2.A00().CGg((1LJ) null, 1475200931), (FilenameFilter) null, linkedHashSet2);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        for (AnonymousClass3Q2 r6 : map.values()) {
            String str7 = r6.A2k;
            if (str7 != null) {
                String name10 = new File(str7).getName();
                0qQ.A07(name10);
                linkedHashSet3.add(name10);
            }
            List list5 = r6.A4a;
            if (!(list5 == null || !(!list5.isEmpty()) || (list = r6.A4a) == null)) {
                for (C282745Eo r07 : list) {
                    String str8 = r07.A05;
                    if (str8 != null) {
                        String name11 = new File(str8).getName();
                        0qQ.A07(name11);
                        linkedHashSet3.add(name11);
                    }
                }
            }
        }
        PendingMediaStore.A00(r3, AnonymousClass45F.A01(), (FilenameFilter) null, linkedHashSet3);
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        for (AnonymousClass3Q2 r62 : map.values()) {
            C273744n7 r08 = r62.A1L;
            if (!(r08 == null || (str = r08.A01) == null)) {
                String name12 = new File(str).getName();
                0qQ.A07(name12);
                linkedHashSet4.add(name12);
            }
            for (AnonymousClass51I r09 : r62.A1V.A03) {
                String name13 = new File(r09.A05).getName();
                0qQ.A07(name13);
                linkedHashSet4.add(name13);
            }
        }
        PendingMediaStore.A00(r3, AnonymousClass457.A02(), (FilenameFilter) null, linkedHashSet4);
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        for (AnonymousClass3Q2 r010 : map.values()) {
            for (C60895JtF jtF : r010.A1j.A06) {
                String str9 = jtF.A06;
                if (str9 != null) {
                    String name14 = new File(str9).getName();
                    0qQ.A07(name14);
                    linkedHashSet5.add(name14);
                }
            }
        }
        PendingMediaStore.A00(r3, AnonymousClass457.A05(), (FilenameFilter) null, linkedHashSet5);
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        for (AnonymousClass3Q2 r82 : map.values()) {
            String str10 = r82.A33;
            if (str10 != null) {
                String name15 = new File(str10).getName();
                0qQ.A07(name15);
                linkedHashSet6.add(name15);
            }
            String str11 = r82.A3Z;
            if (str11 != null) {
                String name16 = new File(str11).getName();
                0qQ.A07(name16);
                linkedHashSet6.add(name16);
            }
        }
        PendingMediaStore.A00(r3, AnonymousClass457.A04(), (FilenameFilter) null, linkedHashSet6);
        if (182.A06(0Tu.A06, userSession, 36318084542306158L)) {
            try {
                2Nn r1 = pendingMediaStore.A00;
                if (r1 == null) {
                    2Nn A004 = AnonymousClass830.A00(context, userSession);
                    pendingMediaStore.A00 = A004;
                    if (A004.A02()) {
                        file = A004.A05;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else if (r1.A02()) {
                    file = r1.A05;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
                PendingMediaStore.A00(r3, file, (FilenameFilter) null, linkedHashSet6);
            } catch (Exception unused) {
            }
        }
        PendingMediaStore.A00(r3, AnonymousClass1F2.A00().CGg((1LJ) null, 761593505), (FilenameFilter) null, linkedHashSet6);
        String string = 1Au.A00(userSession).A01.getString("captured_media_recovery_info", "");
        0qQ.A07(string);
        boolean z = true;
        if (string.length() == 0 || !182.A06(r7, userSession, 36322791825549730L)) {
            z = false;
        }
        if (!z) {
            File cacheDir = context.getCacheDir();
            0qQ.A07(cacheDir);
            PendingMediaStore.A02(pendingMediaStore, "tmp_photo_", ".jpg", PendingMediaStore.A00(r3, cacheDir, AnonymousClass45L.A00, linkedHashSet6));
            PendingMediaStore.A02(pendingMediaStore, 2RR.A01(), ".jpg", PendingMediaStore.A00(r3, new File(2RR.A01()), (FilenameFilter) null, linkedHashSet6));
            if (182.A06(r7, userSession, 36322791825615267L)) {
                long A005 = PendingMediaStore.A00(r3, AnonymousClass1F2.A00().CGg((1LJ) null, 554767808), (FilenameFilter) null, linkedHashSet6);
                String path = AnonymousClass1F2.A00().CGg((1LJ) null, 554767808).getPath();
                0qQ.A07(path);
                PendingMediaStore.A02(pendingMediaStore, path, ".mp4", A005);
            }
        }
        File cacheDir2 = context.getCacheDir();
        0qQ.A07(cacheDir2);
        PendingMediaStore.A02(pendingMediaStore, "story_share_content_", "", PendingMediaStore.A00(r3, cacheDir2, AnonymousClass45M.A00, linkedHashSet6));
        File cacheDir3 = context.getCacheDir();
        0qQ.A07(cacheDir3);
        PendingMediaStore.A02(pendingMediaStore, "direct_share_content_", "", PendingMediaStore.A00(r3, cacheDir3, AnonymousClass45N.A00, linkedHashSet6));
        List A0a = 00k.A0a(map.keySet());
        0qQ.A0B(userSession, 1);
        try {
            Set A0k = 00k.A0k(A0a);
            File file6 = new File(context.getFilesDir(), 002.A0R(userSession.A06, "/pending_media_backup"));
            if (file6.exists() && (listFiles = file6.listFiles()) != null) {
                for (File file7 : listFiles) {
                    if (file7 != null && !A0k.contains(file7.getName())) {
                        0mb.A01(C12612Szw.A00, file7.getPath(), (Set) null);
                    }
                }
            }
        } catch (Throwable th) {
            new 0eQ(th);
        }
        File[] listFiles2 = context.getFilesDir().listFiles();
        if (listFiles2 != null) {
            0sC r5 = new 0sC(listFiles2);
            while (r5.hasNext()) {
                File file8 = (File) r5.next();
                String name17 = file8.getName();
                0qQ.A07(name17);
                if (00p.A0k(name17, "pending_media_", false)) {
                    String name18 = file8.getName();
                    0qQ.A07(name18);
                    if (00p.A0i(name18, ".jpg", false) && !linkedHashSet6.contains(file8.getName()) && r3.apply(file8)) {
                        file8.delete();
                    }
                }
            }
        }
    }
}
