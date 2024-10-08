package X;

/* renamed from: X.5Wb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C286365Wb extends 03J implements C62320sa {
    public C286365Wb(Object obj) {
        super(0, obj, C285185Qc.class, "invalidateNodes", "invalidateNodes()V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C288905cg r0;
        C285185Qc r13 = (C285185Qc) this.receiver;
        01p r02 = r13.A01;
        01p r30 = r02;
        Object[] objArr = r02.A03;
        long[] jArr = r02.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((j & ((j ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ -1) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            AnonymousClass5VG r4 = (AnonymousClass5VG) objArr[(i << 3) + i3];
                            if (((C267794cD) r4).A03.A08) {
                                C267794cD r1 = ((C267794cD) r4).A03;
                                C285045Pl r5 = null;
                                while (r1 != null) {
                                    if (r1 instanceof C268794e0) {
                                        r13.A02.A09(r1);
                                    } else if ((r1.A01 & 1024) != 0 && (r1 instanceof C267944cV)) {
                                        int i4 = 0;
                                        for (C267794cD r3 = ((C267944cV) r1).A00; r3 != null; r3 = r3.A02) {
                                            if ((r3.A01 & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    r1 = r3;
                                                } else {
                                                    if (r5 == null) {
                                                        r5 = new C285045Pl(new C267794cD[16]);
                                                    }
                                                    if (r1 != null) {
                                                        r5.A09(r1);
                                                        r1 = null;
                                                    }
                                                    r5.A09(r3);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    r1 = AnonymousClass5WH.A00(r5);
                                }
                                C267794cD r12 = ((C267794cD) r4).A03;
                                if (r12.A08) {
                                    C285045Pl r6 = new C285045Pl(new C267794cD[16]);
                                    C267794cD r03 = r12.A02;
                                    if (r03 == null) {
                                        AnonymousClass5WH.A06(r6, r12);
                                    } else {
                                        r6.A09(r03);
                                    }
                                    while (true) {
                                        int i5 = r6.A00;
                                        if (i5 == 0) {
                                            break;
                                        }
                                        C267794cD r42 = (C267794cD) r6.A00(i5 - 1);
                                        if ((r42.A00 & 1024) != 0) {
                                            while (true) {
                                                if ((r42.A01 & 1024) == 0) {
                                                    r42 = r42.A02;
                                                    if (r42 == null) {
                                                        break;
                                                    }
                                                } else {
                                                    C285045Pl r32 = null;
                                                    do {
                                                        if (r42 instanceof C268794e0) {
                                                            r13.A02.A09(r42);
                                                        } else if ((r42.A01 & 1024) != 0 && (r42 instanceof C267944cV)) {
                                                            int i6 = 0;
                                                            for (C267794cD r2 = ((C267944cV) r42).A00; r2 != null; r2 = r2.A02) {
                                                                if ((r2.A01 & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        r42 = r2;
                                                                    } else {
                                                                        if (r32 == null) {
                                                                            r32 = new C285045Pl(new C267794cD[16]);
                                                                        }
                                                                        if (r42 != null) {
                                                                            r32.A09(r42);
                                                                            r42 = null;
                                                                        }
                                                                        r32.A09(r2);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                                continue;
                                                            }
                                                        }
                                                        r42 = AnonymousClass5WH.A00(r32);
                                                        continue;
                                                    } while (r42 != null);
                                                }
                                            }
                                        } else {
                                            AnonymousClass5WH.A06(r6, r42);
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            } else {
                                continue;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        r30.A05();
        0vq r122 = r13.A00;
        Object[] objArr2 = r122.A03;
        long[] jArr2 = r122.A02;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j2 = jArr2[i7];
                if ((((j2 ^ -1) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i8 = 8 - (((i7 - length2) ^ -1) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j2 & 255) < 128) {
                            AnonymousClass5VE r7 = (AnonymousClass5VE) objArr2[(i7 << 3) + i9];
                            if (!((C267794cD) r7).A03.A08) {
                                r7.DGD(C288905cg.Inactive);
                            } else {
                                C267794cD r43 = ((C267794cD) r7).A03;
                                C268794e0 r23 = null;
                                C285045Pl r14 = null;
                                boolean z = false;
                                boolean z2 = true;
                                while (r43 != null) {
                                    if (r43 instanceof C268794e0) {
                                        C268794e0 r44 = (C268794e0) r43;
                                        if (r23 != null) {
                                            z = true;
                                        }
                                        if (r13.A02.A04(r44)) {
                                            r13.A03.A09(r44);
                                            z2 = false;
                                        }
                                        r23 = r44;
                                    } else if ((r43.A01 & 1024) != 0 && (r43 instanceof C267944cV)) {
                                        int i10 = 0;
                                        for (C267794cD r33 = ((C267944cV) r43).A00; r33 != null; r33 = r33.A02) {
                                            if ((r33.A01 & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    r43 = r33;
                                                } else {
                                                    if (r14 == null) {
                                                        r14 = new C285045Pl(new C267794cD[16]);
                                                    }
                                                    if (r43 != null) {
                                                        r14.A09(r43);
                                                        r43 = null;
                                                    }
                                                    r14.A09(r33);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    r43 = AnonymousClass5WH.A00(r14);
                                }
                                C267794cD r15 = ((C267794cD) r7).A03;
                                if (r15.A08) {
                                    C285045Pl r52 = new C285045Pl(new C267794cD[16]);
                                    C267794cD r04 = r15.A02;
                                    if (r04 == null) {
                                        AnonymousClass5WH.A06(r52, r15);
                                    } else {
                                        r52.A09(r04);
                                    }
                                    while (true) {
                                        int i11 = r52.A00;
                                        if (i11 == 0) {
                                            break;
                                        }
                                        C267794cD r34 = (C267794cD) r52.A00(i11 - 1);
                                        if ((r34.A00 & 1024) != 0) {
                                            while (true) {
                                                if ((r34.A01 & 1024) == 0) {
                                                    r34 = r34.A02;
                                                    if (r34 == null) {
                                                        break;
                                                    }
                                                } else {
                                                    C285045Pl r20 = null;
                                                    do {
                                                        if (r34 instanceof C268794e0) {
                                                            C268794e0 r35 = (C268794e0) r34;
                                                            if (r23 != null) {
                                                                z = true;
                                                            }
                                                            if (r13.A02.A04(r35)) {
                                                                r13.A03.A09(r35);
                                                                z2 = false;
                                                            }
                                                            r23 = r35;
                                                        } else if ((r34.A01 & 1024) != 0 && (r34 instanceof C267944cV)) {
                                                            int i12 = 0;
                                                            for (C267794cD r22 = ((C267944cV) r34).A00; r22 != null; r22 = r22.A02) {
                                                                if ((r22.A01 & 1024) != 0) {
                                                                    i12++;
                                                                    if (i12 == 1) {
                                                                        r34 = r22;
                                                                    } else {
                                                                        if (r20 == null) {
                                                                            r20 = new C285045Pl(new C267794cD[16]);
                                                                        }
                                                                        if (r34 != null) {
                                                                            r20.A09(r34);
                                                                            r34 = null;
                                                                        }
                                                                        r20.A09(r22);
                                                                    }
                                                                }
                                                            }
                                                            if (i12 == 1) {
                                                                continue;
                                                            }
                                                        }
                                                        r34 = AnonymousClass5WH.A00(r20);
                                                        continue;
                                                    } while (r34 != null);
                                                }
                                            }
                                        } else {
                                            AnonymousClass5WH.A06(r52, r34);
                                        }
                                    }
                                    if (z2) {
                                        if (z) {
                                            r0 = C288925ci.A00(r7);
                                        } else if (r23 == null || (r0 = r23.A0I()) == null) {
                                            r0 = C288905cg.Inactive;
                                        }
                                        r7.DGD(r0);
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
            }
        }
        r122.A05();
        0vq r36 = r13.A02;
        Object[] objArr3 = r36.A03;
        long[] jArr3 = r36.A02;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i13 = 0;
            while (true) {
                long j3 = jArr3[i13];
                if ((((j3 ^ -1) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8 - (((i13 - length3) ^ -1) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j3 & 255) < 128) {
                            C268794e0 r24 = (C268794e0) objArr3[(i13 << 3) + i15];
                            if (r24.A08) {
                                C288905cg A0I = r24.A0I();
                                r24.A0J();
                                if (A0I != r24.A0I() || r13.A03.A04(r24)) {
                                    C288925ci.A01(r24);
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length3) {
                    break;
                }
                i13++;
            }
        }
        r36.A05();
        r13.A03.A05();
        r13.A04.invoke();
        if (r30.A01 != 0) {
            str = "Unprocessed FocusProperties nodes";
        } else if (r122.A01 != 0) {
            str = "Unprocessed FocusEvent nodes";
        } else if (r36.A01 == 0) {
            return C60340gF.A00;
        } else {
            str = "Unprocessed FocusTarget nodes";
        }
        I2E.A01(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
