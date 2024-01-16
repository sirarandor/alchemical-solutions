package net.mcreator.alchems.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhound<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("alchems", "modelhound"), "main");
	public final ModelPart bb_main;

	public Modelhound(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -12.0F, -3.0F, 5.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -14.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(7.0F, -14.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, -2.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 33).addBox(3.0F, -6.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 8).addBox(7.0F, -6.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, -2.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 27).addBox(2.0F, -14.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 31)
				.addBox(7.0F, -14.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 33).addBox(8.0F, -12.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 0.0F, 2.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(37, 32).addBox(3.0F, -6.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 17).addBox(7.0F, -6.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 39)
						.addBox(2.0F, -8.0F, 4.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 25).addBox(8.0F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 2.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(13, 15).addBox(1.0F, -8.0F, -26.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 15).addBox(0.0F, -9.0F, -22.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -6.0F, 3.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 0).addBox(3.0F, -7.0F, -2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 3.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(31, 24).addBox(2.0F, -12.0F, 1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 9).addBox(2.0F, -10.0F, 7.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 39).addBox(2.0F, -8.0F, 5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 32).addBox(2.0F, -10.0F, 8.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, 1.0F, -18.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -6.0F, 3.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(15, 24).addBox(0.0F, -10.0F, 7.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, -1.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -5.0F, -13.0F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -6.0F, 3.0F, -0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
