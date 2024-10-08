package X;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AL6 implements SharedPreferences.Editor {
    public AtomicBoolean A00 = new AtomicBoolean(false);
    public final SharedPreferences.Editor A01;
    public final AnonymousClass96z A02;
    public final List A03;

    public AL6(SharedPreferences.Editor editor, AnonymousClass96z r5) {
        int A032 = AnonymousClass0fD.A03(-651397151);
        this.A02 = r5;
        this.A01 = editor;
        this.A03 = new CopyOnWriteArrayList();
        AnonymousClass0fD.A0A(-480377139, A032);
    }

    private void A00() {
        int A032 = AnonymousClass0fD.A03(-2004015218);
        if (this.A00.getAndSet(false)) {
            AnonymousClass96z r4 = this.A02;
            Iterator it = r4.getAll().keySet().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (!this.A03.contains(A18) && !r4.A03(A18)) {
                    this.A01.remove(r4.A02(A18));
                }
            }
        }
        AnonymousClass0fD.A0A(1958749870, A032);
    }

    private void A01() {
        int A032 = AnonymousClass0fD.A03(514123398);
        AnonymousClass96z r4 = this.A02;
        Iterator it = r4.A04.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.A03.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(r4, AnonymousClass7TE.A18(it2));
            }
        }
        AnonymousClass0fD.A0A(834024435, A032);
    }

    private void A02(String str, byte[] bArr) {
        int A032 = AnonymousClass0fD.A03(506072280);
        AnonymousClass96z r1 = this.A02;
        if (!r1.A03(str)) {
            this.A03.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                int A033 = AnonymousClass0fD.A03(2076925802);
                String A022 = r1.A02(str);
                Pair pair = new Pair(A022, C375539Dz.A00(r1.A01.ASD(bArr, A022.getBytes(StandardCharsets.UTF_8))));
                AnonymousClass0fD.A0A(1114495862, A033);
                this.A01.putString((String) pair.first, (String) pair.second);
                AnonymousClass0fD.A0A(316908228, A032);
            } catch (GeneralSecurityException e) {
                SecurityException securityException = new SecurityException(AnonymousClass7TF.A0m("Could not encrypt data: ", e), e);
                AnonymousClass0fD.A0A(-483965803, A032);
                throw securityException;
            }
        } else {
            SecurityException securityException2 = new SecurityException(002.A0R(str, " is a reserved key for the encryption keyset."));
            AnonymousClass0fD.A0A(-721632018, A032);
            throw securityException2;
        }
    }

    public final void apply() {
        int A032 = AnonymousClass0fD.A03(167835877);
        A00();
        this.A01.apply();
        A01();
        this.A03.clear();
        AnonymousClass0fD.A0A(145687036, A032);
    }

    public final SharedPreferences.Editor clear() {
        int A032 = AnonymousClass0fD.A03(282658565);
        this.A00.set(true);
        AnonymousClass0fD.A0A(-1656198250, A032);
        return this;
    }

    public final boolean commit() {
        int A032 = AnonymousClass0fD.A03(1744181652);
        A00();
        try {
            return this.A01.commit();
        } finally {
            A01();
            this.A03.clear();
            AnonymousClass0fD.A0A(-1771923622, A032);
        }
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        int A032 = AnonymousClass0fD.A03(2030925703);
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z ? (byte) 1 : 0);
        A02(str, allocate.array());
        AnonymousClass0fD.A0A(-1562137838, A032);
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f) {
        int A032 = AnonymousClass0fD.A03(-343291869);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f);
        A02(str, allocate.array());
        AnonymousClass0fD.A0A(547026731, A032);
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i) {
        int A032 = AnonymousClass0fD.A03(823310973);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i);
        A02(str, allocate.array());
        AnonymousClass0fD.A0A(2115638928, A032);
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j) {
        int A032 = AnonymousClass0fD.A03(2044625631);
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j);
        A02(str, allocate.array());
        AnonymousClass0fD.A0A(-439170613, A032);
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        int A032 = AnonymousClass0fD.A03(-844666613);
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        A02(str, allocate.array());
        AnonymousClass0fD.A0A(-1235774795, A032);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, 04u r8) {
        int A032 = AnonymousClass0fD.A03(657249646);
        if (r8 == null) {
            r8 = new 04u(0);
            r8.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(r8.size());
        int size = r8.size() * 4;
        Iterator it = r8.iterator();
        while (it.hasNext()) {
            byte[] bytes = AnonymousClass7TE.A18(it).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(1);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        A02(str, allocate.array());
        AnonymousClass0fD.A0A(-757274001, A032);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        int A032 = AnonymousClass0fD.A03(2143696393);
        AnonymousClass96z r2 = this.A02;
        if (!r2.A03(str)) {
            this.A01.remove(r2.A02(str));
            this.A03.add(str);
            AnonymousClass0fD.A0A(-2006644008, A032);
            return this;
        }
        SecurityException securityException = new SecurityException(002.A0R(str, " is a reserved key for the encryption keyset."));
        AnonymousClass0fD.A0A(-551029895, A032);
        throw securityException;
    }
}
