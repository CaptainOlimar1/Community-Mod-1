package communityMod.common.items;

import communityMod.textures.TextureHandler;

import net.minecraft.item.Item;

public class ItemOther extends Item{

  public ItemOther(int id, int texture) {
		super(id);
		this.setTextureFile(TextureHandler.ITEM_TEXTURE_A);
		this.iconIndex = texture;
	}

}
