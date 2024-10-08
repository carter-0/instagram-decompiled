package X;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

/* renamed from: X.3KG  reason: invalid class name */
public final class AnonymousClass3KG {
    public boolean A00;
    public final AnonymousClass3KH A01;
    public final C62710vD A02;
    public final Set A03;
    public final Set A04;
    public final CopyOnWriteArraySet A05;
    public final AnonymousClass3KK[] A06 = AnonymousClass3KI.A00(this);
    public final AtomicInteger A07 = new AtomicInteger();

    public AnonymousClass3KG(Context context, 0lg r5) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(context, 2);
        this.A01 = new AnonymousClass3KH(context, r5);
        C61410nE r2 = C61410nE.A00;
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        0qQ.A0B(r2, 1);
        this.A02 = new C62710vD(r2, A002);
        this.A03 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A04 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A05 = new CopyOnWriteArraySet();
    }

    public static final void A01(AnonymousClass3KG r7) {
        File[] listFiles;
        int length;
        if (!r7.A05.isEmpty()) {
            String[] strArr = AnonymousClass3KJ.A04;
            int i = 0;
            do {
                File file = new File(strArr[i]);
                if (file.canRead() && (listFiles = file.listFiles(new AnonymousClass9OM(r7))) != null && (length = listFiles.length) != 0) {
                    if (length > 10) {
                        listFiles = AnonymousClass3KI.A01(listFiles, 10);
                    }
                    for (int min = Math.min(10, listFiles.length) - 1; -1 < min; min--) {
                        String path = listFiles[min].getPath();
                        0qQ.A07(path);
                        A02(r7, path);
                    }
                    i++;
                } else {
                    return;
                }
            } while (i < 2);
        }
    }

    public static final void A02(AnonymousClass3KG r12, String str) {
        List A0a;
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = r12.A05;
            synchronized (copyOnWriteArraySet) {
                A0a = 00k.A0a(copyOnWriteArraySet);
            }
            if (!A0a.isEmpty()) {
                String str2 = str;
                int A052 = 00l.A05(str, '/', str.length() - 1);
                if (A052 != -1) {
                    str2 = str.substring(A052 + 1);
                    0qQ.A07(str2);
                }
                if (!00p.A0k(str2, ".pending", false)) {
                    Set set = r12.A03;
                    if (!set.contains(str2)) {
                        Matcher matcher = AnonymousClass3KJ.A03.matcher(str);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            0qQ.A07(group);
                            int parseInt = Integer.parseInt(group);
                            String group2 = matcher.group(2);
                            0qQ.A07(group2);
                            String group3 = matcher.group(3);
                            0qQ.A07(group3);
                            int parseInt2 = Integer.parseInt(group3);
                            String group4 = matcher.group(4);
                            0qQ.A07(group4);
                            int parseInt3 = Integer.parseInt(group4);
                            String group5 = matcher.group(5);
                            0qQ.A07(group5);
                            int parseInt4 = Integer.parseInt(group5);
                            String group6 = matcher.group(6);
                            0qQ.A07(group6);
                            long timeInMillis = new GregorianCalendar(parseInt, Integer.parseInt(group2) - 1, parseInt2, parseInt3, parseInt4, Integer.parseInt(group6)).getTimeInMillis();
                            Long valueOf = Long.valueOf(timeInMillis);
                            if (valueOf != null) {
                                ArrayList<AnonymousClass3KQ> arrayList = new ArrayList<>();
                                Iterator it = copyOnWriteArraySet.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (((AnonymousClass3KQ) next).A00 <= timeInMillis) {
                                        arrayList.add(next);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    for (AnonymousClass3KQ amY : arrayList) {
                                        set.add(str2);
                                        11Z.A02(new C40988AmY(amY, valueOf));
                                    }
                                }
                            }
                        }
                        AnonymousClass3KH r3 = r12.A01;
                        0xI A012 = 0xI.A01("ig_android_screenshot_path_parse_fail", "screenshot_detector");
                        A012.A0C("path", str);
                        A012.A0C("phone_model", Build.MODEL);
                        C60510iO.A00(r3.A01).EFq(A012);
                    }
                }
            }
            r12.A04.remove(str);
        } catch (Throwable th) {
            r12.A04.remove(str);
            throw th;
        }
    }

    public final void A03() {
        int andIncrement = this.A07.getAndIncrement();
        if (andIncrement > 0) {
            new Throwable();
        } else if (andIncrement < 0) {
            0KC.A0N("NonBlockingScreenshotDetectorImpl", "Negative active watchers: %d previous watchers", new Throwable(), new Object[]{Integer.valueOf(andIncrement)});
        } else {
            this.A02.ATE(new AnonymousClass3KL(this));
        }
    }

    public final void A04() {
        C62710vD r1;
        0ng r0;
        int decrementAndGet = this.A07.decrementAndGet();
        if (decrementAndGet > 0) {
            if (!this.A05.isEmpty()) {
                r1 = this.A02;
                r0 = new C319966rW(this);
            } else {
                return;
            }
        } else if (decrementAndGet < 0) {
            0KC.A0K("NonBlockingScreenshotDetectorImpl", "Already stopped ScreenshotDetector", new Throwable());
            return;
        } else {
            r1 = this.A02;
            r0 = new AnonymousClass6YQ(this);
        }
        r1.ATE(r0);
    }

    public final void A05(AnonymousClass3KQ r3) {
        if (r3 != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = this.A05;
            synchronized (copyOnWriteArraySet) {
                copyOnWriteArraySet.add(r3);
                copyOnWriteArraySet.size();
            }
        }
    }

    public final void A06(AnonymousClass3KQ r3) {
        if (r3 != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = this.A05;
            synchronized (copyOnWriteArraySet) {
                copyOnWriteArraySet.remove(r3);
                copyOnWriteArraySet.size();
            }
        }
    }

    public static final AnonymousClass3KQ A00(AnonymousClass3KO r3) {
        return new AnonymousClass3KQ(r3, System.currentTimeMillis());
    }
}
