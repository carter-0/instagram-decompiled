package org.webrtc;

import android.media.MediaCodecInfo;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.Predicate;

public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    public static final Predicate defaultAllowedPredicate = new Predicate() {
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new Predicate(predicate) {
                public final /* synthetic */ Predicate val$other;

                {
                    this.val$other = r2;
                }

                public /* synthetic */ Predicate and(Predicate predicate) {
                    return 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                          (wrap: org.webrtc.Predicate$2 : 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$2) = 
                          (r1v0 'this' org.webrtc.HardwareVideoDecoderFactory$1 A[THIS])
                          (r2v0 'predicate' org.webrtc.Predicate)
                         call: org.webrtc.Predicate.2.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR)
                         in method: org.webrtc.HardwareVideoDecoderFactory.1.and(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:98)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:480)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:437)
                        	at jadx.core.codegen.ClassGen.addField(ClassGen.java:378)
                        	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:348)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$2) = 
                          (r1v0 'this' org.webrtc.HardwareVideoDecoderFactory$1 A[THIS])
                          (r2v0 'predicate' org.webrtc.Predicate)
                         call: org.webrtc.Predicate.2.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR in method: org.webrtc.HardwareVideoDecoderFactory.1.and(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 42 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 46 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                          (wrap: org.webrtc.Predicate$2 : 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$2) = 
                          (r1v0 'this' org.webrtc.Predicate$2 A[THIS])
                          (r2v0 'predicate' org.webrtc.Predicate)
                         call: org.webrtc.Predicate.2.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR)
                         in method: org.webrtc.Predicate.2.and(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	... 63 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$2) = 
                          (r1v0 'this' org.webrtc.Predicate$2 A[THIS])
                          (r2v0 'predicate' org.webrtc.Predicate)
                         call: org.webrtc.Predicate.2.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR in method: org.webrtc.Predicate.2.and(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 72 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: org.webrtc.Predicate.2
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 76 more
                        */
                    /*
                        this = this;
                        org.webrtc.Predicate$2 r0 = new org.webrtc.Predicate$2
                        r0.<init>(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.AnonymousClass1.and(org.webrtc.Predicate):org.webrtc.Predicate");
                }

                public /* synthetic */ Predicate negate() {
                    return new Predicate.AnonymousClass3();
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return new Predicate(predicate) {
                        public final /* synthetic */ Predicate val$other;

                        {
                            this.val$other = r2;
                        }

                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return new AnonymousClass2(predicate);
                        }

                        public /* synthetic */ Predicate negate() {
                            return new AnonymousClass3();
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                                  (wrap: org.webrtc.Predicate$1 : 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$1) = 
                                  (r1v0 'this' org.webrtc.HardwareVideoDecoderFactory$1 A[THIS])
                                  (r2v0 'predicate' org.webrtc.Predicate)
                                 call: org.webrtc.Predicate.1.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR)
                                 in method: org.webrtc.HardwareVideoDecoderFactory.1.or(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:98)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:480)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:437)
                                	at jadx.core.codegen.ClassGen.addField(ClassGen.java:378)
                                	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:348)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$1) = 
                                  (r1v0 'this' org.webrtc.HardwareVideoDecoderFactory$1 A[THIS])
                                  (r2v0 'predicate' org.webrtc.Predicate)
                                 call: org.webrtc.Predicate.1.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR in method: org.webrtc.HardwareVideoDecoderFactory.1.or(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	... 42 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	... 46 more
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                                  (wrap: org.webrtc.Predicate$1 : 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$1) = 
                                  (r1v0 'this' org.webrtc.Predicate$1 A[THIS])
                                  (r2v0 'predicate' org.webrtc.Predicate)
                                 call: org.webrtc.Predicate.1.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR)
                                 in method: org.webrtc.Predicate.1.or(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	... 63 more
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$1) = 
                                  (r1v0 'this' org.webrtc.Predicate$1 A[THIS])
                                  (r2v0 'predicate' org.webrtc.Predicate)
                                 call: org.webrtc.Predicate.1.<init>(org.webrtc.Predicate, org.webrtc.Predicate):void type: CONSTRUCTOR in method: org.webrtc.Predicate.1.or(org.webrtc.Predicate):org.webrtc.Predicate, dex: classes11.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	... 72 more
                                Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: org.webrtc.Predicate.1
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	... 76 more
                                */
                            /*
                                this = this;
                                org.webrtc.Predicate$1 r0 = new org.webrtc.Predicate$1
                                r0.<init>(r2)
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.AnonymousClass1.or(org.webrtc.Predicate):org.webrtc.Predicate");
                        }

                        public /* bridge */ /* synthetic */ boolean test(Object obj) {
                            return MediaCodecUtils.isHardwareAccelerated((MediaCodecInfo) obj);
                        }

                        public boolean test(MediaCodecInfo mediaCodecInfo) {
                            return MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
                        }
                    };

                    /* JADX WARNING: Illegal instructions before constructor call */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public HardwareVideoDecoderFactory(org.webrtc.EglBase.Context r2, org.webrtc.Predicate r3, java.util.Map r4) {
                        /*
                            r1 = this;
                            org.webrtc.Predicate r0 = defaultAllowedPredicate
                            if (r3 == 0) goto L_0x0008
                            org.webrtc.Predicate r0 = r3.and(r0)
                        L_0x0008:
                            r1.<init>(r2, r0, r4)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.<init>(org.webrtc.EglBase$Context, org.webrtc.Predicate, java.util.Map):void");
                    }

                    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
                        return super.createDecoder(videoCodecInfo);
                    }

                    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
                        return super.getSupportedCodecs();
                    }

                    public HardwareVideoDecoderFactory(EglBase.Context context, Map map) {
                        this(context, (Predicate) null, map);
                    }

                    public HardwareVideoDecoderFactory(EglBase.Context context) {
                        this(context, (Predicate) null, (Map) null);
                    }

                    public HardwareVideoDecoderFactory(EglBase.Context context, Predicate predicate) {
                        this(context, predicate, (Map) null);
                    }

                    @Deprecated
                    public HardwareVideoDecoderFactory() {
                        this((EglBase.Context) null);
                    }
                }
