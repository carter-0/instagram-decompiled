package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.3tA  reason: invalid class name and case insensitive filesystem */
public final class C254853tA {
    public static final ImmutableList A03;
    public static final ImmutableList A04;
    public static final ImmutableList A05;
    public static final ImmutableList A06;
    public static final ImmutableList A07 = ImmutableList.of(new C254853tA("skull", "💀", 2131971077), new C254853tA("pizza", "🍕", 2131971076), new C254853tA("clown", "🤡", 2131971072), new C254853tA("ghost", "👻", 2131971073), new C254853tA("melting_face", "🫠", 2131971075), new C254853tA("growing_heart", "💗", 2131971074));
    public static final C254853tA A08;
    public static final C254853tA A09;
    public final int A00;
    public final String A01;
    public final String A02;

    public C254853tA(String str, String str2, int i) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C254853tA) || !0qQ.A0K(this.A02, ((C254853tA) obj).A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    static {
        ImmutableList of = ImmutableList.of(new C254853tA("laughing", "😂", 2131971071), new C254853tA("surprised", "😮", 2131971083), new C254853tA("heart_eyes", "😍", 2131971070), new C254853tA("crying", "😢", 2131971066), new C254853tA("applause", "👏", 2131971065), new C254853tA("fire", "🔥", 2131971068), new C254853tA("party", "🎉", 2131971078), new C254853tA("perfect", "💯", 2131971079));
        0qQ.A07(of);
        A05 = of;
        C254853tA r0 = new C254853tA("laughing", "😂", 2131971071);
        C254853tA r14 = new C254853tA("surprised", "😮", 2131971083);
        C254853tA r1 = new C254853tA("heart_eyes", "😍", 2131971070);
        C254853tA r29 = r0;
        C254853tA r30 = r14;
        C254853tA r31 = r1;
        ImmutableList of2 = ImmutableList.of(r29, r30, r31, new C254853tA("crying", "😢", 2131971066), new C254853tA("applause", "👏", 2131971065), new C254853tA("fire", "🔥", 2131971068), new C254853tA("eyes", "👀", 2131971067));
        0qQ.A07(of2);
        A06 = of2;
        C254853tA r12 = new C254853tA("heart", "❤", 0);
        A09 = r12;
        C254853tA r3 = new C254853tA("heart", "❤", 0);
        A08 = r3;
        ImmutableList of3 = ImmutableList.of(r12, new C254853tA("laughing", "😂", 2131971071), new C254853tA("surprised", "😮", 2131971083), new C254853tA("crying", "😢", 2131971066), new C254853tA("angry", "😡", 0), new C254853tA("thumbs-up", "👍", 0));
        0qQ.A07(of3);
        A04 = of3;
        C254853tA r11 = new C254853tA("laughing", "😆", 2131971071);
        C254853tA r8 = new C254853tA("surprised", "😮", 2131971083);
        ImmutableList of4 = ImmutableList.of(r3, r11, r8, new C254853tA("crying", "😢", 2131971066), new C254853tA("angry", "😠", 0), new C254853tA("thumbs-up", "👍", 0));
        0qQ.A07(of4);
        A03 = of4;
    }
}
