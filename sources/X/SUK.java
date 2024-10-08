package X;

import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SUK {
    public static final T93 A0M;
    public static final Pattern A0N = Pattern.compile("\\[([^\\[\\]])*\\]");
    public static final Pattern A0O = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    public static final Pattern A0P = Pattern.compile("\\d(?=[^,}][^,}])");
    public static final Pattern A0Q = Pattern.compile(" ");
    public static final Pattern A0R = Pattern.compile("[- ]");
    public int A00 = 0;
    public int A01 = 0;
    public T93 A02;
    public C3272379z A03 = new C3272379z(64);
    public String A04 = "";
    public String A05 = "";
    public StringBuilder A06 = AnonymousClass7TE.A1A();
    public StringBuilder A07 = AnonymousClass7TE.A1A();
    public StringBuilder A08 = AnonymousClass7TE.A1A();
    public StringBuilder A09 = AnonymousClass7TE.A1A();
    public StringBuilder A0A = AnonymousClass7TE.A1A();
    public List A0B = AnonymousClass7TE.A1C();
    public boolean A0C = true;
    public boolean A0D = false;
    public boolean A0E = false;
    public int A0F = 0;
    public T93 A0G;
    public String A0H = "";
    public String A0I;
    public boolean A0J = false;
    public boolean A0K = false;
    public final PhoneNumberUtil A0L;

    static {
        T93 t93 = new T93();
        t93.A0I = "NA";
        A0M = t93;
    }

    private String A00() {
        T93 t93;
        List<T92> list;
        StringBuilder sb = this.A09;
        int length = sb.length();
        String obj = sb.toString();
        if (length < 3) {
            return A05(obj);
        }
        if (!this.A0D || this.A02.A0P.size() <= 0) {
            t93 = this.A02;
            list = t93.A0Q;
        } else {
            t93 = this.A02;
            list = t93.A0P;
        }
        boolean z = t93.A0X;
        for (T92 t92 : list) {
            if ((!z || this.A0D || t92.A07 || PhoneNumberUtil.A08(t92.A02)) && DbV.A1b(t92.A01, A0O)) {
                this.A0B.add(t92);
            }
        }
        A06(obj);
        String A0A2 = A0A();
        if (A0A2.length() > 0) {
            return A0A2;
        }
        if (A09()) {
            return A01();
        }
        return this.A06.toString();
    }

    private String A01() {
        StringBuilder sb;
        String A032;
        StringBuilder sb2 = this.A09;
        int length = sb2.length();
        if (length > 0) {
            int i = 0;
            do {
                A032 = A03(sb2.charAt(i));
                i++;
            } while (i < length);
            if (this.A0C) {
                return A05(A032);
            }
            sb = this.A06;
        } else {
            sb = this.A0A;
        }
        return sb.toString();
    }

    private String A02() {
        boolean z = false;
        if (this.A02.A00 == 1) {
            StringBuilder sb = this.A09;
            if (!(sb.charAt(0) != '1' || sb.charAt(1) == '0' || sb.charAt(1) == '1')) {
                z = true;
            }
        }
        int i = 1;
        if (z) {
            StringBuilder sb2 = this.A0A;
            sb2.append('1');
            sb2.append(' ');
            this.A0D = true;
        } else {
            T93 t93 = this.A02;
            if (t93.A0Y) {
                Pattern A002 = this.A03.A00(t93.A0K);
                StringBuilder sb3 = this.A09;
                Matcher matcher = A002.matcher(sb3);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.A0D = true;
                    i = matcher.end();
                    this.A0A.append(sb3.substring(0, i));
                }
            }
            i = 0;
        }
        StringBuilder sb4 = this.A09;
        String substring = sb4.substring(0, i);
        sb4.delete(0, i);
        return substring;
    }

    private String A03(char c) {
        Pattern pattern = A0Q;
        StringBuilder sb = this.A08;
        Matcher matcher = pattern.matcher(sb);
        if (matcher.find(this.A0F)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            sb.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A0F = start;
            return sb.substring(0, start + 1);
        }
        if (this.A0B.size() == 1) {
            this.A0C = false;
        }
        this.A0H = "";
        return this.A06.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (X.DbV.A1b(java.lang.Character.toString(r7), r3) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r6.A07() != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(X.SUK r6, char r7, boolean r8) {
        /*
            java.lang.StringBuilder r2 = r6.A06
            r2.append(r7)
            if (r8 == 0) goto L_0x000d
            int r0 = r2.length()
            r6.A00 = r0
        L_0x000d:
            boolean r0 = java.lang.Character.isDigit(r7)
            r5 = 1
            if (r0 != 0) goto L_0x0031
            int r0 = r2.length()
            if (r0 != r5) goto L_0x00ae
            java.util.regex.Pattern r3 = com.facebook.phonenumbers.PhoneNumberUtil.A0B
            java.lang.String r1 = "[+＋]+"
            r0 = 0
            if (r3 != 0) goto L_0x0025
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r1, r0)
        L_0x0025:
            com.facebook.phonenumbers.PhoneNumberUtil.A0B = r3
            java.lang.String r0 = java.lang.Character.toString(r7)
            boolean r0 = X.DbV.A1b(r0, r3)
            if (r0 == 0) goto L_0x00ae
        L_0x0031:
            r3 = 0
            r4 = 1
            if (r5 != 0) goto L_0x0089
            r6.A0C = r3
            r6.A0J = r4
        L_0x0039:
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r6.A0J
            if (r0 != 0) goto L_0x012b
            boolean r0 = r6.A08()
            if (r0 == 0) goto L_0x005b
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x012b
        L_0x004d:
            r6.A0C = r4
            r6.A0E = r3
            java.util.List r0 = r6.A0B
            r0.clear()
            java.lang.String r0 = r6.A00()
            return r0
        L_0x005b:
            java.lang.String r1 = r6.A05
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0073
            java.lang.StringBuilder r0 = r6.A09
            r0.insert(r3, r1)
            java.lang.StringBuilder r1 = r6.A0A
            java.lang.String r0 = r6.A05
            int r0 = r1.lastIndexOf(r0)
            r1.setLength(r0)
        L_0x0073:
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A02()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x012b
            java.lang.StringBuilder r1 = r6.A0A
            r0 = 32
            r1.append(r0)
            goto L_0x004d
        L_0x0089:
            r0 = 43
            if (r7 != r0) goto L_0x009c
            java.lang.StringBuilder r1 = r6.A07
            r0 = r1
        L_0x0090:
            r1.append(r7)
            if (r8 == 0) goto L_0x0039
            int r0 = r0.length()
            r6.A01 = r0
            goto L_0x0039
        L_0x009c:
            r1 = 10
            int r0 = java.lang.Character.digit(r7, r1)
            char r7 = java.lang.Character.forDigit(r0, r1)
            java.lang.StringBuilder r0 = r6.A07
            r0.append(r7)
            java.lang.StringBuilder r1 = r6.A09
            goto L_0x0090
        L_0x00ae:
            r5 = 0
            goto L_0x0031
        L_0x00b0:
            java.lang.StringBuilder r0 = r6.A07
            int r1 = r0.length()
            if (r1 == 0) goto L_0x012b
            if (r1 == r4) goto L_0x012b
            r0 = 2
            if (r1 == r0) goto L_0x012b
            r0 = 3
            if (r1 != r0) goto L_0x00c8
            boolean r0 = r6.A08()
            if (r0 == 0) goto L_0x0120
            r6.A0E = r4
        L_0x00c8:
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x00d4
            r6.A0E = r3
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.StringBuilder r0 = r6.A0A
            r1.append(r0)
            java.lang.StringBuilder r0 = r6.A09
            X.Pxf.A1O(r1, r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x00e7:
            java.util.List r0 = r6.A0B
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x011b
            java.lang.String r3 = r6.A03(r7)
            java.lang.String r1 = r6.A0A()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00fe
            return r1
        L_0x00fe:
            java.lang.StringBuilder r0 = r6.A09
            java.lang.String r0 = r0.toString()
            r6.A06(r0)
            boolean r0 = r6.A09()
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = r6.A01()
            return r0
        L_0x0112:
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = r6.A05(r3)
            return r0
        L_0x011b:
            java.lang.String r0 = r6.A00()
            return r0
        L_0x0120:
            java.lang.String r0 = r6.A02()
            r6.A05 = r0
            java.lang.String r0 = r6.A00()
            return r0
        L_0x012b:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUK.A04(X.SUK, char, boolean):java.lang.String");
    }

    private String A05(String str) {
        StringBuilder A0d;
        StringBuilder sb = this.A0A;
        int length = sb.length();
        if (!this.A0K || length <= 0 || sb.charAt(length - 1) == ' ') {
            A0d = JTQ.A0d(sb);
        } else {
            A0d = AnonymousClass7TE.A1A();
            A0d.append(new String(sb));
            A0d.append(' ');
        }
        return AnonymousClass7TF.A0l(str, A0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = X.AnonymousClass7TE.A1A();
        r4 = r5.A0L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A07() {
        /*
            r5 = this;
            java.lang.StringBuilder r2 = r5.A09
            int r0 = r2.length()
            r1 = 0
            if (r0 == 0) goto L_0x005c
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            com.facebook.phonenumbers.PhoneNumberUtil r4 = r5.A0L
            int r3 = r4.A0B(r2, r0)
            if (r3 == 0) goto L_0x005c
            r2.setLength(r1)
            r2.append(r0)
            X.79y r2 = r4.A00
            java.lang.String r1 = r2.A01(r3)
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            X.T93 r0 = r4.A0D(r3)
        L_0x002d:
            r5.A02 = r0
        L_0x002f:
            java.lang.String r0 = java.lang.Integer.toString(r3)
            java.lang.StringBuilder r1 = r5.A0A
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = ""
            r5.A05 = r0
            r0 = 1
            return r0
        L_0x0043:
            java.lang.String r0 = r5.A0I
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002f
            int r0 = r4.A0A(r1)
            java.lang.String r0 = r2.A01(r0)
            X.T93 r0 = r4.A0E(r0)
            if (r0 != 0) goto L_0x002d
            X.T93 r0 = A0M
            goto L_0x002d
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUK.A07():boolean");
    }

    private boolean A08() {
        Pattern A002 = this.A03.A00(002.A0R("\\+|", this.A02.A0I));
        StringBuilder sb = this.A07;
        Matcher matcher = A002.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.A0D = true;
        int end = matcher.end();
        StringBuilder sb2 = this.A09;
        sb2.setLength(0);
        sb2.append(sb.substring(end));
        StringBuilder sb3 = this.A0A;
        sb3.setLength(0);
        sb3.append(sb.substring(0, end));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    private boolean A09() {
        String replaceAll;
        Iterator it = this.A0B.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.A0C = false;
                break;
            }
            T92 t92 = (T92) it.next();
            String str = t92.A03;
            if (this.A0H.equals(str)) {
                break;
            }
            if (str.indexOf(124) == -1) {
                String replaceAll2 = A0P.matcher(A0N.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                StringBuilder sb = this.A08;
                sb.setLength(0);
                String str2 = t92.A01;
                Matcher matcher = this.A03.A00(replaceAll2).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                if (group.length() < this.A09.length()) {
                    replaceAll = "";
                } else {
                    replaceAll = group.replaceAll(replaceAll2, str2).replaceAll("9", " ");
                }
                if (replaceAll.length() > 0) {
                    sb.append(replaceAll);
                    this.A0H = str;
                    this.A0K = A0R.matcher(t92.A02).find();
                    this.A0F = 0;
                    return true;
                }
            }
            it.remove();
        }
        return false;
    }

    public final String A0A() {
        for (T92 t92 : this.A0B) {
            Matcher matcher = this.A03.A00(t92.A03).matcher(this.A09);
            if (matcher.matches()) {
                this.A0K = A0R.matcher(t92.A02).find();
                return A05(matcher.replaceAll(t92.A01));
            }
        }
        return "";
    }

    public final void A0B() {
        this.A04 = "";
        this.A06.setLength(0);
        this.A07.setLength(0);
        this.A08.setLength(0);
        this.A0F = 0;
        this.A0H = "";
        this.A0A.setLength(0);
        this.A05 = "";
        this.A09.setLength(0);
        this.A0C = true;
        this.A0J = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0D = false;
        this.A0E = false;
        this.A0B.clear();
        this.A0K = false;
        if (!this.A02.equals(this.A0G)) {
            String str = this.A0I;
            PhoneNumberUtil phoneNumberUtil = this.A0L;
            T93 A0E2 = phoneNumberUtil.A0E(phoneNumberUtil.A00.A01(phoneNumberUtil.A0A(str)));
            if (A0E2 == null) {
                A0E2 = A0M;
            }
            this.A02 = A0E2;
        }
    }

    public SUK(PhoneNumberUtil phoneNumberUtil, String str) {
        this.A0L = phoneNumberUtil;
        this.A0I = str;
        T93 A0E2 = phoneNumberUtil.A0E(phoneNumberUtil.A00.A01(phoneNumberUtil.A0A(str)));
        A0E2 = A0E2 == null ? A0M : A0E2;
        this.A02 = A0E2;
        this.A0G = A0E2;
    }

    private void A06(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            List list = ((T92) it.next()).A04;
            if (list.size() != 0) {
                if (!this.A03.A00(AnonymousClass7TE.A19(list, Math.min(length, C51966G9m.A06(list)))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }
}
